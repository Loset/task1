package com.test;

import com.deque.LinkedList;
import com.list.ArrayList;
import com.list.List;

/**
 * Created by student7 on 22.03.2017.
 */
public class test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        for (int i = 0; i < 3; i++) {
            list.add(i);
        }
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
        System.out.println();
    }
}
