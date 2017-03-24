package com.figure;

/**
 * Created by student7 on 03.03.2017.
 */
public class PointHelper {
    public static boolean isCollinearity(Point p1, Point p2, Point p3) {
        //Подсчет площади
        double area = (p1.getX() * p2.getY() + p2.getX() * p3.getY() + p3.getX() * p1.getY() -
                (p2.getX() * p1.getY() + p3.getX() * p2.getY() + p1.getX() * p3.getY())) / 2;
        //Если площадь равна нулю Точки коллинеарны
        if (area == 0) {
            return true;
        } else {
            return false;
        }
    }
}
