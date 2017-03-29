package com.ui;

import com.list.ArrayList;

/**
 * Created by student7 on 29.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        SimpleUserInterface ui = new SimpleUserInterface();
        ui.setList(new ArrayList());
        ui.show();
    }
}
