package com.xworkz.Override.external;

import com.xworkz.Override.internal.Wheat;

public class OrganicWheat extends Wheat {

    public OrganicWheat() {
        System.out.println("OrganicWheat: No-arg constructor");
    }

    @Override
    public void grind() {
        System.out.println("OrganicWheat: Grinding pure, chemical-free grains.");
    }

    public void store(Wheat wheat) {
        if (wheat != null) {
            System.out.println("OrganicWheat: Storing in a cool, dry place.");
        } else {
            System.out.println("Nothing to store.");
        }
    }
}
