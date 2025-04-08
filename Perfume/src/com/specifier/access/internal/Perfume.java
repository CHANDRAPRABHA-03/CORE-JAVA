package com.specifier.access.internal;

public class Perfume {

    public Perfume() {
        System.out.println("In no-arg Perfume constructor running");
    }

    public void spray() {
        System.out.println("Running public spray method");
    }

    void blendScents() {
        System.out.println("Running package-default blendScents method");
    }

    private void secretFormula() {
        System.out.println("Running private secretFormula method");
    }
}
