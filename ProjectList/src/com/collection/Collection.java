package com.collection;

public interface Collection<T> extends java.lang.Iterable<T> {
    void add(T item);

    void clear();

    boolean isEmpty();

    boolean remove(T obj);

    int size();
}
