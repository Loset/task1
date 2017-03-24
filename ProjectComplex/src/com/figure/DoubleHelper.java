package com.figure;

/**
 * Created by student7 on 03.03.2017.
 */
public class DoubleHelper {
    private static final double DELTA = 0.001;

    public static boolean equals(double a, double b) {
        return (Math.abs(a - b) < DELTA);
    }
}
