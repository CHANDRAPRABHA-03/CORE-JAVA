package com.specifier.access.internal;

public class Fragrance{

    public Fragrance() {
        System.out.println("Running FragranceLab constructor");
    }

    public void testPerfume() {
        System.out.println("Accessing public and package-default methods from internal package:");
        Perfume perfume = new Perfume();
        perfume.spray();
        perfume.blendScents();
    }
}

