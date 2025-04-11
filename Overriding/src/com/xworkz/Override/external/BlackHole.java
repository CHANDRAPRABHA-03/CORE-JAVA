package com.xworkz.Override.external;

import com.xworkz.Override.internal.Black;

public class BlackHole extends Black {

    public BlackHole() {
        System.out.println("BlackHole: No-arg constructor");
    }

    @Override
    public void describe() {
        System.out.println("BlackHole is an intense region of gravity that swallows everything");
    }

    public void absorb(Black black) {
        if (black != null) {
            System.out.println("BlackHole is absorbing matter and light");
        } else {
            System.out.println("Nothing to absorb");
        }
    }
}
