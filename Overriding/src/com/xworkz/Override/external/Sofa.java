package com.xworkz.Override.external;

import com.xworkz.Override.internal.Furniture;

public class Sofa extends Furniture {

    public Sofa() {
        System.out.println("Sofa: No-arg constructor");
    }

    @Override
    public void material() {
        System.out.println("Sofa is made of soft cushions and fabric.");
    }

    public void comfort(Furniture furniture) {
        if (furniture != null) {
            System.out.println("Sofa provides great comfort.");
        } else {
            System.out.println("No furniture to provide comfort.");
        }
    }
}
