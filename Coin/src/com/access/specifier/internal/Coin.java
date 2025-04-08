package com.access.specifier.internal;

public class Coin {

    public Coin() {
        System.out.println("In no-arg Coin constructor running");
    }

    public void flip() {
        System.out.println("Running public flip method");
    }

    void inspectEdges() {
        System.out.println("Running package-default inspectEdges method");
    }

    private void metalComposition() {
        System.out.println("Running private metalComposition method");
    }
}

