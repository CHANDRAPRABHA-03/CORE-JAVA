package com.xworkz.Override.external;

import com.xworkz.Override.internal.Comedy;

public class Laughter extends Comedy {

    public Laughter() {
        System.out.println("Laughter: No-arg constructor");
    }

    @Override
    public void trigger() {
        System.out.println("Laughter bursts out from a good comedy moment!");
    }

    public void echo(Comedy comedy) {
        if (comedy != null) {
            System.out.println("Laughter echoes through the room after comedy lands");
        } else {
            System.out.println("No comedy to laugh at");
        }
    }
}
