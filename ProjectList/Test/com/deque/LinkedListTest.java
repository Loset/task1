package com.deque;

import com.list.ArrayList;
import com.list.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by dns on 27.03.2017.
 */
class LinkedListTest {
    @Test
    public void init_list_check_size() {
        LinkedList list = new LinkedList();
        int size = list.size();
        assertEquals(0, size);
    }
    @Test
    public void add_in_list_check_size() {
        LinkedList list = new LinkedList();
        list.add(1);
        int size = list.size();
        assertEquals(1, size);
    }
    @Test
    public void add_in_list_check_get() {
        LinkedList list = new LinkedList();
        list.add(1);
        Object o = list.get(0);
        assertEquals(1, o);
    }
    @Test
    public void add_in_list_check_getLast() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        Object o = list.getLast();
        assertEquals(2, o);
    }
    @Test
    public void add_in_list_check_getFirst() {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        Object o = list.getFirst();
        assertEquals(1, o);
    }

}