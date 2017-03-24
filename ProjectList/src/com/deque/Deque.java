package com.deque;

import com.collection.Collection;

public interface Deque extends Collection{
    void addFirst(Object item);

    void addLast(Object item);

    void removeFirst();

    void removeLast();

    Object getFirst();

    Object getLast();

    Object pollFirst();

    Object pollLast();
}
