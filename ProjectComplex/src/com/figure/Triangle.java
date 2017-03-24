package com.figure;

import java.util.Scanner;

/**
 * Created by student7 on 03.03.2017.
 */
public class Triangle implements Figure {
    private Point a;
    private Point b;
    private Point c;

    Triangle() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте вершину А");
        Point a = new Point();
        System.out.println("Введте вершину B");
        Point b = new Point();
        System.out.println("Введте вершину C");
        Point c = new Point();
        if (!PointHelper.isCollinearity(a, b, c)) {
            System.out.println("Вершины коллинеарны");
            System.out.println("Введите значения заново");
            System.out.println("Введте вершину А");
            a = new Point();
            System.out.println("Введте вершину B");
            b = new Point();
            System.out.println("Введте вершину C");
            c = new Point();
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public void setA(Point a) {
        if (PointHelper.isCollinearity(a, this.b, this.c)) {
            this.a = a;
        } else {
            System.out.println("Не корректные значения");
        }
    }

    public void setB(Point b) {
        if (PointHelper.isCollinearity(this.a, b, this.c)) {
            this.b = b;
        } else {
            System.out.println("Не корректные значения");
        }
    }

    public void setC(Point c) {
        if (PointHelper.isCollinearity(this.a, this.b, c)) {
            this.c = c;
        } else {
            System.out.println("Не корректные значения");
        }
    }

    public void turning(double degre) {
        double x = (a.getX() + b.getX()) / 2;
        double y = (a.getY() + b.getY()) / 2;
//        Point middleAb = new Point(x, y);
//        double distance = Math.sqrt((x - c.getX()) * (x - c.getX()) - (y - c.getY()) * (y - c.getY()));
//        double center = (distance / 3) * 2;

    }

    @Override
    public void move(Point point) {

    }

    @Override
    public void scaling(double coefficient) {

    }

    @Override
    public double getSquare() {
        return 0;
    }

    @Override
    public void show() {

    }
}
