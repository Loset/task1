package com.list;

import com.collection.Collection;

public interface List<T> extends Collection<T> {
    void add(T item);

    void add(int index, T item);

    T get(int index);

    int indexOf(T obj);

    int lastIndexOf(T obj);

    void replace(int index, T item);

    List subList(int from, int to);

    int size();

    void remove(int index);
}
