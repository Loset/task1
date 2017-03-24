package com.figure;

import java.util.Scanner;

public class Point {
    private double y;
    private double x;

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введте x");
        this.x = in.nextDouble();
        System.out.println("Введте y");
        this.y = in.nextDouble();
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point point) {
        return (DoubleHelper.equals(x, point.getX()) && DoubleHelper.equals(y, point.getY()));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public int hashCode() {
        return (int) x;
    }

    public Fourth fourth() {
        if ((x >= 0) && (y > 0)) {
//            System.out.println("Точка лежит в первой четверти");
            return Fourth.FIRST;
        } else if ((x < 0) && (y >= 0)) {
//            System.out.println("Точка лежит во второй четверти");
            return  Fourth.SECOND;
        } else if ((x <= 0) && (y < 0)) {
//            System.out.println("Точка лежит в третей четверти");
            return  Fourth.THIRD;
        } else if ((x > 0) && (y <= 0)) {
//            System.out.println("Точка лежит в четвертой четверти");
            return  Fourth.FOURTH;
        } else {
            return null;
        }
    }

    public boolean isSymmetric(Point point) {
        if ((x + point.getX() == 0) && (y + point.getY() == 0)) {
            return true;
        }
        return false;
    }
}
