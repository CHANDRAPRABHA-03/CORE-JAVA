package com.xworkz.Override.external;

import com.xworkz.Override.internal.HeadGear;

public class Helmet extends HeadGear {

    public Helmet() {
        System.out.println("Helmet: No-arg constructor");
    }

    @Override
    public void protect() {
        System.out.println("Helmet provides protection while riding.");
    }

    public void strap(HeadGear gear) {
        if (gear != null) {
            System.out.println("Strapping the helmet securely.");
        } else {
            System.out.println("Cannot strap a null gear.");
        }
    }
}
