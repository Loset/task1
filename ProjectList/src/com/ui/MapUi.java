package com.ui;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by student7 on 29.03.2017.
 */
public class MapUi {
    private Map map = new TreeMap();

    public MapUi(Map collection) {
        this.map = collection;
    }

    public void printMenu() {
        System.out.println("1 - Добавить строковый элемент");
        System.out.println("2 - Удалить строковый элемент");
        System.out.println("3 - Определить содержится ли элемент в коллекции");
        System.out.println("4 - Вывести элементы коллекции");
        System.out.println("5 - Выход");
    }

    public void add(Object key, Object item) {
        map.put(key, item);
    }

    public void delete(int index) {
        map.remove(index);
    }

    public void find(Object key) {
        map.containsKey(key);
    }

    public void print() {
        for (Object o : map.keySet()) {
            System.out.println(o);
        }
    }

    public void show() {
        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu();
            int number = in.nextInt();
            in.nextLine();
            if (number == 1) {
                System.out.println("Введите ключ");
                String key = in.nextLine();
                System.out.println("Введите значение");
                String item = in.nextLine();
                add(key, item);
                in.nextLine();
            } else if (number == 2) {
                System.out.println("Введите ключ");
                delete(in.nextInt());
            } else if (number == 3) {
                System.out.println("Введите строку");
                find(in.nextLine());
            } else if (number == 4) {
                print();
            } else if (number == 5) {
                break;
            }
        }
    }
}
