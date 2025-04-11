package com.xworkz.Override.external;

import com.xworkz.Override.internal.Actor;

public class Surya extends Actor {

    public Surya() {
        System.out.println("Surya: No-arg constructor");
    }

    @Override
    public void act() {
        System.out.println("Surya performs intense and versatile roles");
    }

    public void promoteEducation(Actor actor) {
        if (actor != null) {
            System.out.println("Surya actively promotes education through Agaram Foundation");
        } else {
            System.out.println("Actor object is null");
        }
    }
}
