package com.xworkz.Override.external;

import com.xworkz.Override.internal.Star;

public class Galaxy extends Star {

    public Galaxy() {
        System.out.println("Galaxy: No-arg constructor");
    }

    @Override
    public void shine() {
        System.out.println("Galaxy glows with billions of stars united");
    }

    public void orbit(Star star) {
        if (star != null) {
            System.out.println("Galaxy embraces each star in its grand orbit");
        } else {
            System.out.println("Without a star, the galaxy is just empty space");
        }
    }
}
