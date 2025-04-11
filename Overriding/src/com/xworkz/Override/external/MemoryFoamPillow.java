package com.xworkz.Override.external;

import com.xworkz.Override.internal.Pillow;

public class MemoryFoamPillow extends Pillow {

    public MemoryFoamPillow() {
        System.out.println("MemoryFoamPillow: No-arg constructor");
    }

    @Override
    public void support() {
        System.out.println("Memory foam pillow molds to the shape of your head");
    }

    public void contour(Pillow pillow) {
        if (pillow != null) {
            System.out.println("Contour support activated for better neck alignment");
        } else {
            System.out.println("No pillow provided for contouring");
        }
    }
}
