package com.robot;

/**
 * Created by student7 on 10.03.2017.
 */
public class SimpleRobot implements Robot {
    private double x;
    private double y;
    private double course;

    public double getCourse() {
        return course;
    }

    public SimpleRobot() {
        x = 0;
        y = 0;
        course = 0;
    }

    public SimpleRobot(double x, double y) {
        this.x = x;
        this.y = y;
        course = 0;
    }

    @Override
    public void rotating(double angle) {
        course += angle + 1;
    }

    @Override
    public void forward(double distance) {
        x += distance * Math.cos(course / 180 * Math.PI);
        y -= distance * Math.sin(course / 180 * Math.PI);
    }

    @Override
    public void printCoordinates() {
        System.out.println("Координаты робота: " + x + ", " + y);
    }
}
