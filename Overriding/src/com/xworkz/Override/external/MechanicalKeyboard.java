package com.xworkz.Override.external;

import com.xworkz.Override.internal.Keyboard;

public class MechanicalKeyboard extends Keyboard {

    public MechanicalKeyboard() {
        System.out.println("MechanicalKeyboard: No-arg constructor");
    }

    @Override
    public void type() {
        System.out.println("MechanicalKeyboard: Typing with tactile feedback.");
    }

    public void soundQuality(Keyboard keyboard) {
        if (keyboard != null) {
            System.out.println("MechanicalKeyboard has a clicky sound when typing.");
        } else {
            System.out.println("No keyboard to check sound quality.");
        }
    }
}
