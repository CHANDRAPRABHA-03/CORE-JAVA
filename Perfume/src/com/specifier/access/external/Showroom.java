package com.specifier.access.external;

import com.specifier.access.internal.Perfume;

public class Showroom {

    public Showroom() {
        System.out.println("Running Showroom constructor");
    }

    public void demoPerfume() {
        System.out.println("Accessing public method of Perfume from external package:");
        Perfume perfume = new Perfume();
        perfume.spray();
    }
}

