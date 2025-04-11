package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bad;

public class Lie extends Bad {

    public Lie() {
        System.out.println("Lie: No-arg constructor");
    }

    @Override
    public void reveal() {
        System.out.println("A lie disguises the truth");
    }

    public void coverUp(Bad bad) {
        if (bad != null) {
            System.out.println("Lie is trying to cover up something bad");
        } else {
            System.out.println("Nothing bad to cover up");
        }
    }
}
