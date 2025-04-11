package com.xworkz.Override.external;

import com.xworkz.Override.internal.Dosa;

public class MasalaDosa extends Dosa {

    public MasalaDosa() {
        System.out.println("MasalaDosa: No-arg constructor");
    }

    @Override
    public void taste() {
        System.out.println("MasalaDosa: Filled with spicy potato masala, tastes delicious.");
    }

    public void serve(Dosa dosa) {
        if (dosa != null) {
            System.out.println("MasalaDosa: Serving hot with chutney and sambar.");
        } else {
            System.out.println("Nothing to serve.");
        }
    }
}
