package com.list;

import com.collection.Collection;

public interface List extends Collection {
    void add(Object item);

    void add(int index, Object item);

    Object get(int index);

    int indexOf(Object obj);

    int lastIndexOf(Object obj);

    void replace(int index, Object item);

    List subList(int from, int to);

    int size();

    void remove(int index);
}
