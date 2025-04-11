package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bird;

public class Parrot extends Bird {

    public Parrot() {
        System.out.println("Parrot: No-arg constructor");
    }

    @Override
    public void sound() {
        System.out.println("Parrot says 'Keee Keee' and can mimic words!");
    }

    public void flyColorfully(Bird bird) {
        if (bird != null) {
            System.out.println("Parrot flies with colorful feathers");
        } else {
            System.out.println("No bird to demonstrate colorful flying");
        }
    }
}
