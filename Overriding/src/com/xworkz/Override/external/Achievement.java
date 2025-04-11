package com.xworkz.Override.external;

import com.xworkz.Override.internal.Talent;

public class Achievement extends Talent {

    public Achievement() {
        System.out.println("Achievement: No-arg constructor");
    }

    @Override
    public void display() {
        System.out.println("Achievement is the reward of refined talent");
    }

    public void celebrate(Talent talent) {
        if (talent != null) {
            System.out.println("Celebrating the achievement that talent has earned");
        } else {
            System.out.println("No talent to celebrate");
        }
    }
}
