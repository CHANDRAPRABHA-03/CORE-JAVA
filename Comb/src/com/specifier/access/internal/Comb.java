package com.specifier.access.internal;

public class Comb {

    public Comb() {
        System.out.println("In no-arg Comb constructor running");
    }

    public void detangle() {
        System.out.println("Running public detangle method");
    }

    void cleanComb() {
        System.out.println("Running package-default cleanComb method");
    }

    private void breakTeeth() {
        System.out.println("Running private breakTeeth method");
    }
}

