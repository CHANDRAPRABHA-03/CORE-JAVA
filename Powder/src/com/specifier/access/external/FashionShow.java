package com.specifier.access.external;

import com.specifier.access.internal.Powder;

public class FashionShow {

    public FashionShow() {
        System.out.println("Running FashionShow constructor");
    }

    public void externalPowderUse() {
        System.out.println("Accessing public method of Powder from external package:");
        Powder powder = new Powder();
        powder.applyFace();
    }
}
