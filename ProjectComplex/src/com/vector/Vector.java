package com.vector;

/**
 * Created by student7 on 01.03.2017.
 */
public class Vector {
    private double x;
    private double y;
    private double z;

    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Vector(double x, double y) {
        this.x = x;
        this.y = y;
        z = 0;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public Vector add(Vector vector) {
        return new Vector(x + vector.x, y + vector.y, z + vector.z);
    }

    public Vector subtraction(Vector vector) {
        return new Vector(x - vector.x, y - vector.y, z - vector.z);
    }

    public double composition(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }


}
