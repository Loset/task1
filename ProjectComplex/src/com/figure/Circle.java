package com.figure;

import java.util.Scanner;

public class Circle implements Figure {
    private final double DELTA = 0.001;
    private Point center;
    private double r;

    public double getR() {
        return r;
    }

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", r=" + r +
                '}';
    }

    public void show() {
        System.out.println(this);
    }

    @Override
    public void move(Point point) {
        center.setX(center.getX() + point.getX());
        center.setY(center.getY() + point.getY());
    }

    @Override
    public void scaling(double coefficient) {
        this.r *= coefficient;
    }

    @Override
    public double getSquare() {
        return Math.PI * r * r;
    }

    public boolean contains(Point point) {
        double distance = Math.sqrt((point.getX() - center.getX()) * (point.getX() - center.getX()) -
                    (point.getY() - center.getY()) * (point.getY() - center.getY()));
        return distance <= r;
    }

    public boolean contains(Circle circle) {
        double distance = Math.sqrt((circle.center.getX() - center.getX()) * (circle.center.getX() - center.getX()) -
                    (circle.center.getY() - center.getY()) * (circle.center.getY() - center.getY()));
        return (distance + circle.getR()) <= r;
    }

    public double getLength() {
        return 2 * Math.PI * r;
    }

    public void randomMove() {
        double x = -99 + Math.random()*99;
        double y = -99 + Math.random()*99;
        Point point = new Point(x, y);
        move(point);
    }

    public double getCenterDistance(Circle circle) {
        return Math.sqrt((center.getX() - circle.center.getX()) * (center.getX() - circle.center.getX()) -
                (center.getY() - circle.center.getY()) * (center.getY() - circle.center.getY()));
    }

    public boolean interSects(Circle circle) {
        double distance = getCenterDistance(circle);
        if (Math.abs(circle.getR() + r - distance) < DELTA) {
            return true;
        } else if (Math.abs(circle.getR() - r - distance) < DELTA) {
            return true;
        } else {
            return false;
        }
    }
}
