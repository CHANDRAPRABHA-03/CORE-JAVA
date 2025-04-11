package com.xworkz.Override.external;

import com.xworkz.Override.internal.Sound;

public class Speaker extends Sound {

    public Speaker() {
        System.out.println("Speaker: No-arg constructor");
    }

    @Override
    public void produce() {
        System.out.println("Speaker produces sound from electrical signals");
    }

    public void play(Sound sound) {
        if (sound != null) {
            System.out.println("Speaker is playing the sound");
        } else {
            System.out.println("No sound to play — speaker is silent");
        }
    }
}
