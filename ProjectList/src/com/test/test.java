package com.test;


import com.deque.LinkedList;
import com.list.ArrayList;

/**
 * Created by student7 on 22.03.2017.
 */
public class test {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 3; i++) {
            linkedList.add(i);
        }
        for (Object o : linkedList) {
            System.out.println(o);
        }

    }
}
