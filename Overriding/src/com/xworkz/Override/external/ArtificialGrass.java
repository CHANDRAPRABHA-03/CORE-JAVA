package com.xworkz.Override.external;

import com.xworkz.Override.internal.Grass;

public class ArtificialGrass extends Grass {

    public ArtificialGrass() {
        System.out.println("ArtificialGrass: No-arg constructor");
    }

    @Override
    public void grow() {
        System.out.println("Artificial grass does not grow but looks green.");
    }

    public void wash(Grass grass) {
        if (grass != null) {
            System.out.println("Washing artificial grass with water.");
        } else {
            System.out.println("No grass to wash.");
        }
    }
}
