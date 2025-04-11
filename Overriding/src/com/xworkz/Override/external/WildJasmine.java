package com.xworkz.Override.external;

import com.xworkz.Override.internal.Jasmine;

public class WildJasmine extends Jasmine {

    public WildJasmine() {
        System.out.println("WildJasmine: No-arg constructor");
    }

    @Override
    public void fragrance() {
        System.out.println("WildJasmine: Strong and earthy natural scent.");
    }

    public void bloom(Jasmine jasmine) {
        if (jasmine != null) {
            System.out.println("WildJasmine: Blooming in the forest.");
        } else {
            System.out.println("No jasmine plant to bloom.");
        }
    }
}
