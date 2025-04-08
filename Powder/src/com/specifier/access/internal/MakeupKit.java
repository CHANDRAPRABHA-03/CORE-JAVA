package com.specifier.access.internal;

public class MakeupKit {

    public MakeupKit() {
        System.out.println("Running MakeupKit constructor");
    }

    public void usePowder() {
        System.out.println("Accessing public and package-private methods from internal package:");
        Powder powder = new Powder();
        powder.applyFace();
        powder.mixWithBrush();
    }
}

