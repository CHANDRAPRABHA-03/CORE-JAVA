package com.xworkz.Override.external;

import com.xworkz.Override.internal.House;

public class Cleaning extends House {

    public Cleaning() {
        System.out.println("Cleaner: No-arg constructor");
    }

    @Override
    public void clean() {
        System.out.println("Cleaner is cleaning the house thoroughly");
    }

    public void sanitize(House house) {
        if (house != null) {
            System.out.println("Cleaner is sanitizing the house for safety");
        } else {
            System.out.println("No house to sanitize");
        }
    }
}
