package com.complex;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите re: ");
        double re = in.nextDouble();
        System.out.print("Введите im: ");
        double im = in.nextDouble();
        Complex num1 = new Complex(re, im);

        System.out.print("Введите re: ");
        re = in.nextDouble();
        System.out.print("Введите im: ");
        im = in.nextDouble();
        Complex num2 = new Complex(re, im);
        Complex num3 = num1.add(num2);
        System.out.println(num3);
    }
}
