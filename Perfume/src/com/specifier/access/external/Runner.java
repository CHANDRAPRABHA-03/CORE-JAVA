package com.specifier.access.external;

import com.specifier.access.internal.Fragrance;

public class Runner {
    public static void main(String[] args) {
        Fragrance fragrance = new Fragrance();
        fragrance.testPerfume();

        Showroom showroom = new Showroom();
        showroom.demoPerfume();
    }
}

