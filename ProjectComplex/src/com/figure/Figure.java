package com.figure;

/**
 * Created by student7 on 01.03.2017.
 */
public interface Figure {

    void move(Point point);
    void scaling(double coefficient);
    double getSquare();
    void show();

}
