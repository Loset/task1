package com.collection;

public interface Collection extends java.lang.Iterable {
    void add(Object item);

    void clear();

    boolean isEmpty();

    boolean remove(Object obj);

    int size();
}
