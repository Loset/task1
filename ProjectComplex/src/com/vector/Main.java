package com.vector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        Vector v1 = new Vector(x, y, z);

        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        Vector v2 = new Vector(x, y, z);

        Vector v3 = v1.add(v2);
        System.out.println(v3);

        v3 = v1.subtraction(v2);
        System.out.println(v3);

        double n = v1.composition(v2);
        System.out.println(n);
    }
}
