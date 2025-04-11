package com.xworkz.Override.external;

import com.xworkz.Override.internal.Ship;

public class Captain extends Ship {

    public Captain() {
        System.out.println("Captain: No-arg constructor");
    }

    @Override
    public void sail() {
        System.out.println("Captain steers the ship expertly through the waters");
    }

    public void navigate(Ship ship) {
        if (ship != null) {
            System.out.println("Captain is navigating the ship through the storm");
        } else {
            System.out.println("No ship to navigate");
        }
    }
}
