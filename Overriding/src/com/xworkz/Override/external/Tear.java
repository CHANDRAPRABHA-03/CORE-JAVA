package com.xworkz.Override.external;

import com.xworkz.Override.internal.Emotion;

public class Tear extends Emotion {

    public Tear() {
        System.out.println("Tear: No-arg constructor");
    }

    @Override
    public void express() {
        System.out.println("A tear rolls down, silently expressing deep emotion");
    }

    public void fall(Emotion emotion) {
        if (emotion != null) {
            System.out.println("Tear falls from the depth of an emotion");
        } else {
            System.out.println("No emotion to trigger a tear");
        }
    }
}
