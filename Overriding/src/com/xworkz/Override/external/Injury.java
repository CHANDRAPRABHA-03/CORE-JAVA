package com.xworkz.Override.external;

import com.xworkz.Override.internal.Pain;

public class Injury extends Pain {

    public Injury() {
        System.out.println("Injury: No-arg constructor");
    }

    @Override
    public void feel() {
        System.out.println("Injury brings sharp and visible pain");
    }

    public void treat(Pain pain) {
        if (pain != null) {
            System.out.println("Trying to treat the injury and ease the pain");
        } else {
            System.out.println("No pain to treat");
        }
    }
}
