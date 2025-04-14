package com.xworkz.Override.external;

import com.xworkz.Override.internal.Black;

public class Astronomer {

    public Astronomer() {
        System.out.println("Astronomer: No-arg constructor");
    }

    public void study(Black black) {
        if (black != null) {
            black.describe();

            if (black instanceof BlackHole) {
                BlackHole blackHole = (BlackHole) black;
                blackHole.absorb(black);
            } else {
                System.err.println("This black object is not a BlackHole");
            }
        } else {
            System.err.println("Black object is null");
        }
    }
}
