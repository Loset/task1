package com.ui;

import com.list.List;

import java.util.Scanner;

/**
 * Created by student7 on 29.03.2017.
 */
public class SimpleUserInterface implements UserInterface {
    private List list;

    public void setList(List list) {
        this.list = list;
    }

    public void printMenu() {
        System.out.println("1 - Добавить строковый элемент");
        System.out.println("2 - Удалить строковый элемент");
        System.out.println("3 - Определить содержится ли элемент в коллекции");
        System.out.println("4 - Вывести элементы коллекции");
        System.out.println("5 - Выход");
    }

    @Override
    public void add(Object item) {
        list.add(item);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public void find(Object item) {
        if (list.indexOf(item) != -1) {
            System.out.println("Содержится");
        } else {
            System.out.println("Не содержится");
        }
    }

    @Override
    public void print() {
        for (Object o : list) {
            System.out.println(o);
        }
    }

    @Override
    public void show() {
        Scanner in = new Scanner(System.in);
        while (true) {
            printMenu();
            int number = in.nextInt();
            in.nextLine();
            if (number == 1) {
                System.out.println("Введите строку");
                add(in.nextLine());
            } else if (number == 2) {
                System.out.println("Введите номер элемента");
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
