package com.specifier.access.external;

import com.specifier.access.internal.Comb;

public class BeautyParlor {

    public BeautyParlor() {
        System.out.println("Running BeautyParlor constructor");
    }

    public void externalCombAccess() {
        System.out.println("Accessing public method of Comb from external package:");
        Comb comb = new Comb();
        comb.detangle();
    }
}


