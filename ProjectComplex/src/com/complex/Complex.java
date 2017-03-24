package com.complex;

public class Complex {

    private double re;
    private double im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString() {
        String a = isInt(re) ? String.valueOf((int) re) : String.valueOf(re);
        String b = isInt(im) ? String.valueOf((int) Math.abs(im)) : String.valueOf(Math.abs(im));
        String s = "";
        if (re != 0) {
            s = s + a;
        }
        if (im > 0) {
            s = s + "+" + b + "i";
        } else if (im < 0) {
            s = s + "-" + b + "i";
        }
        return s;
    }

    private boolean isInt(double number) {
        return number % 1 == 0;
    }

    public Complex add(Complex number) {
        return new Complex(number.re + re, number.im + im);
    }

    public Complex subtract(Complex number) {
        return new Complex( re - number.re, im - number.re);
    }

    public Complex multiply(Complex number) {
        double newRe = re * number.re - im * number.im;
        double newIm = im * number.re + re * number.im;
        return new Complex(newRe, newIm);
    }
}
