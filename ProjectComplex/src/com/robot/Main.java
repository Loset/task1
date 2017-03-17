package com.robot;

import java.util.Scanner;

/**
 * Created by student7 on 10.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        SimpleRobot robot = new SimpleRobot();
        while (true) {
            System.out.println("1 Поворот");
            System.out.println("2 Передвинуться");
            System.out.println("3 Вывод координат");
            System.out.println("4 Выход");
            int item = in.nextInt();
            if (item == 1) {
                System.out.println("Введите угол");
                double angel = in.nextInt();
                robot.rotating(angel);
            } else if (item == 2) {
                System.out.println("Введите дистанцию");
                double distance = in.nextInt();
                robot.forward(distance);
            } else if (item == 3) {
                robot.printCoordinates();
            } else if (item == 4) {
                break;
            }
        }
    }
}
