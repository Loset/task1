package com.test;


import com.list.ArrayList;

/**
 * Created by student7 on 22.03.2017.
 */
public class test {
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        for (int i = 0; i < 3; i++) {
            array.add(i);
        }
        for (Object o : array) {
//            System.out.println(array.size());
            System.out.println(o);
        }

    }
}
