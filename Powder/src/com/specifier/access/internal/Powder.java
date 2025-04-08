package com.specifier.access.internal;

public class Powder {

    public Powder() {
        System.out.println("In no-arg Powder constructor running");
    }

    public void applyFace() {
        System.out.println("Running public applyFace method");
    }

    void mixWithBrush() {
        System.out.println("Running package-default mixWithBrush method");
    }

    private void spill() {
        System.out.println("Running private spill method");
    }
}
