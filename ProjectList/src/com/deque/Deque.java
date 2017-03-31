package com.deque;

import com.collection.Collection;

public interface Deque<T> extends Collection<T> {
    void addFirst(T item);

    void addLast(T item);

    void removeFirst();

    void removeLast();

    T getFirst();

    T getLast();

    T pollFirst();

    T pollLast();
}
