package com.ui;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by student7 on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        UserInterface ui = new SimpleUserInterface(new TreeSet());
        ui.show();
    }
}
