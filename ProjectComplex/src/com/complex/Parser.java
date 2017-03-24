package com.complex;

/**
 * Created by student7 on 22.02.2017.
 */
public class Parser {

    public static double re;
    public static double im;
    public static char operatinon;

    private static boolean isNumeric(char ch) {
        if ('0' < ch && ch < '9') {
            return true;
        } else {
            return false;
        }
    }

    public static void parse(String st) {
        String num1 = "";
        String num2 = "";
        int i = 0;
        while (isNumeric(st.charAt(i))) {
            num1 = num1 + st.charAt(i);
            i++;
        }
        operatinon = st.charAt(i++);
        while (i < st.length()) {
            num2 = num2 + st.charAt(i);
            i++;
        }
        re = Double.valueOf(num1);
        im = Double.valueOf(num2);
    }
}
