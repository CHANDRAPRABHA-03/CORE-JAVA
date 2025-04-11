package com.xworkz.Override.external;

import com.xworkz.Override.internal.Good;

public class Deed extends Good {

    public Deed() {
        System.out.println("Deed: No-arg constructor");
    }

    @Override
    public void reflect() {
        System.out.println("Doing a good deed that helps others");
    }

    public void inspire(Good good) {
        if (good != null) {
            System.out.println("Good deed inspired someone to act kindly");
        } else {
            System.out.println("No goodness to inspire from");
        }
    }
}
