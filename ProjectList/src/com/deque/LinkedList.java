package com.deque;

import com.list.List;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<T> implements List<T>, Deque<T> {
    public class LinkedListIterator implements java.util.ListIterator<T> {
        int cursor;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if (cursor >= size)
                throw new NoSuchElementException();
            return (T) get(cursor++);
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            return (T) get(--cursor);
        }

        @Override
        public int nextIndex() {
            return cursor;
        }

        @Override
        public int previousIndex() {
            return cursor - 1;
        }

        @Override
        public void remove() {
            LinkedList.this.remove(cursor);
        }

        @Override
        public void set(T o) {
            replace(cursor, o);
        }

        @Override
        public void add(T o) {
            LinkedList.this.add(cursor++, o);
        }
    }

    @Override
    public Iterator iterator() {
        return new LinkedListIterator();
    }

    private static class Node {
        private Object data;
        private Node next;
        private Node prev;

        public void setData(Object data) {
            this.data = data;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrev(Node prev) {
            this.prev = prev;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }

    private Node first;
    private Node last;

    private int size = 0;

    public LinkedList() {
    }

    private LinkedList(Node first, Node last, int size) {
        this.first = first;
        this.last = last;
        this.size = size;
    }

    @Override
    public void addFirst(T item) {
        Node node = new Node();
        node.setData(item);
        if (first == null) {
            first = node;
            last = node;
        } else {
            first.setPrev(node);
            node.setNext(first);
            first = node;
        }
        size++;
    }

    @Override
    public void addLast(T item) {
        Node node = new Node();
        node.setData(item);
        if (last == null) {
            first = node;
            last = node;
        } else {
            last.setNext(node);
            node.setPrev(last);
            last = node;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        if (!isEmpty()) {
            first = first.getNext();
            first.setPrev(null);
            size--;
        }
    }

    @Override
    public void removeLast() {
        if (!isEmpty()) {
            last = last.getPrev();
            last.setNext(null);
            size--;
        }
    }

    @Override
    public T getFirst() {
        if (first == null)
            throw new NoSuchElementException();
        return (T) first.getData();
    }

    @Override
    public T getLast() {
        if (last == null)
            throw new NoSuchElementException();
        return (T) last.getData();
    }

    @Override
    public T pollFirst() {
        if (first == null)
            throw new NoSuchElementException();
        Node node = first;
        removeFirst();
        return (T) node.getData();
    }

    @Override
    public T pollLast() {
        if (last == null)
            throw new NoSuchElementException();
        Node node = last;
        removeLast();
        return (T) node.getData();
    }

    @Override
    public void add(T item) {
        addLast(item);
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public boolean remove(T obj) {
        int i = 0;
        for (Node node = first; null != node.getNext(); ++i) {
            if (node.equals(obj)) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(int index, T item) {
        if (!isIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(item);
            return;
        }

        int i = 0;
        Node newNode = new Node();
        newNode.setData(item);
        for (Node node = first; null != node.getNext(); node = node.getNext()) {
            if (index == i++) {
                newNode.setNext(node);
                Node prev = node.getPrev();
                newNode.setPrev(prev);
                node.setPrev(newNode);
                prev.setNext(newNode);
                return;
            }
        }
    }

    @Override
    public T get(int index) {
        if (!isIndex(index)) {
            throw new IndexOutOfBoundsException();
        }
        Node node = first;
        for (int i = 0; i <= index; i++) {
            if (i == index) {
                return (T) node.getData();
            }
            node = node.getNext();
        }
        return null;
    }

    @Override
    public int indexOf(T obj) {
        int i = 0;
        for (Node node = first; null != node.getNext(); ++i) {
            if (node.equals(obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T obj) {
        Node node = last;
        for (int i = size - 1; node.getPrev() != null; i--) {
            if (node.equals(obj)) {
                return i;
            }
            node = node.getPrev();
        }
        return -1;
    }

    @Override
    public void replace(int index, T item) {
        if ((index >= 0) && (index < size)) {
            Node obj = first;
            for (int i = 0; obj.getNext() != null; i++) {
                if (index == i) {
                    obj.setData(item);
                }
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public List subList(int from, int to) {
        if ((from >= 0) && (from < size) && (to >= 0) && (to < size) && (from <= to)) {
            Node node = first;
            Node first = null;
            Node last;
            for (int i = 0;  i < to; i++) {
                if (i == from) {
                    first = node;
                }
                node = node.getNext();
            }
            last = node;
            return new LinkedList(first, last, to - from + 1);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if ((index >= 0) && (index < size)) {
            int i = 0;
            for (Node node = first; null != node.getNext(); ++i) {
                if (index == i) {
                    Node prev = node.getPrev();
                    Node next = node.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                }
            }
            size--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private boolean isIndex(int index) {
        return (index >= 0) && (index <= size);
    }
}
