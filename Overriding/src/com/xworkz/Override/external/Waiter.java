package com.xworkz.Override.external;

import com.xworkz.Override.internal.Menu;

public class Waiter extends Menu {

    public Waiter() {
        System.out.println("Waiter: No-arg constructor");
    }

    @Override
    public void display() {
        System.out.println("Waiter presents the menu with recommendations and specials");
    }

    public void takeOrder(Menu menu) {
        if (menu != null) {
            System.out.println("Waiter is taking an order based on the menu");
        } else {
            System.out.println("No menu available to take order from");
        }
    }
}
