package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fabric;

public class Towel extends Fabric {

    public Towel() {
        System.out.println("Towel: No-arg constructor");
    }

    @Override
    public void absorb() {
        System.out.println("Towel absorbs water efficiently.");
    }

    public void dry(Fabric fabric) {
        if (fabric != null) {
            System.out.println("Drying body using towel.");
        } else {
            System.out.println("No fabric to dry with.");
        }
    }
}
