package com.specifier.access.internal;

public class Salon {

    public Salon() {
        System.out.println("Running Salon constructor");
    }

    public void useComb() {
        System.out.println("Accessing public and default methods from internal package:");
        Comb comb = new Comb();
        comb.detangle();
        comb.cleanComb();
    }
}
