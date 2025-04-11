package com.xworkz.Override.external;

import com.xworkz.Override.internal.Snack;

public class Chips extends Snack {

    public Chips() {
        System.out.println("Chips: No-arg constructor");
    }

    @Override
    public void eat() {
        System.out.println("Crunching on crispy chips...");
    }

    public void flavor(Snack snack) {
        if (snack != null) {
            System.out.println("Chips come in many flavors like BBQ and Salted.");
        } else {
            System.out.println("No snack to describe flavor.");
        }
    }
}
