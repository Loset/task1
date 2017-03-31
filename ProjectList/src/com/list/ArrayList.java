package com.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T> {
    public class ArrayListIterator implements java.util.ListIterator<T> {
        int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < size;
        }

        @Override
        public T next() {
            if (cursor >= size)
                throw new NoSuchElementException();
            return (T) array[cursor++];
        }

        @Override
        public boolean hasPrevious() {
            return cursor != 0;
        }

        @Override
        public T previous() {
            if (!hasPrevious())
                throw new NoSuchElementException();
            return (T) array[--cursor];
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
            ArrayList.this.remove(cursor);
        }

        @Override
        public void set(T o) {
            replace(cursor, o);
        }

        @Override
        public void add(T o) {
            ArrayList.this.add(cursor++, o);
        }
    }

    private static final int DEFAULT_CAPACITY = 10;

    private int size = 0;
    private Object[] array;

    private ArrayList(T[] array, int size) {
        this.size = size;
        this.array = array;
    }

    public ArrayList() {
        array = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity) {
        array = new Object[capacity];
    }

    @Override
    public void add(T item) {
        if (size == array.length) {
            enhanceArray();
        }
        array[size] = item;
        size++;
    }

    @Override
    public void clear() {
        size = 0;
        array = null;
    }

    @Override
    public boolean isEmpty() {
        return array == null;
    }

    @Override
    public boolean remove(T obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(array[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    private void enhanceArray() {
        int capacity = (array.length * 3) / 2 + 1;
        Object[] newArray = new Object[capacity];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void add(int index, T item) {
        if ((index < 0) || (index > size)) {
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {
            enhanceArray();
        }
        for (int i = size - 1; i > index; --i) {
            array[i] = array[i - 1];
        }
        array[index] = item;
        ++size;
    }

    @Override
    public T get(int index) {
        if (isIndex(index)) {
            return (T) array[index];
        } else {
            return null;
        }
    }

    @Override
    public int indexOf(T obj) {
        for (int i = 0; i < size; i++) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T obj) {
        for (int i = size; i >= 0; i--) {
            if (obj.equals(array[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void replace(int index, T item) {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = item;
    }

    @Override
    public List subList(int from, int to) {
        if (isIndex(from) && (isIndex(to))) {
            Object[] newArray = new Object[to - from];
            for (int i = from; i < to; i++) {
                newArray[i - from] = array[i];
            }
            return new ArrayList(newArray, newArray.length);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void remove(int index) {
        if (isIndex(index)) {
            for (int i = index + 1; i < size; i++) {
                array[i - 1] = array[i];
            }
            array[size] = null;
        } else {
            throw new IndexOutOfBoundsException();
        }
        size--;
    }

    private boolean isIndex(int index) {
        return (index >= 0) && (index < size);
    }

    @Override
    public Iterator iterator() {
        return new ArrayListIterator();
    }
}
