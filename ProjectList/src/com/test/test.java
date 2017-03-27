package com.test;

import com.list.ArrayList;
import com.list.List;

/**
 * Created by student7 on 22.03.2017.
 */
public class test {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        for (int i = 0; i < 3; i++) {
            arrayList.add(i);
        }
        List arrayL = new ArrayList();
        arrayL = arrayList.subList(0, 2);
        for (Object o : arrayList) {
            System.out.println(o);
        }
        System.out.println();
        for (Object o : arrayL) {
            System.out.println(o);
        }
    }
}
