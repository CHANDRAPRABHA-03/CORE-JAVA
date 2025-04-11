package com.xworkz.Override.external;

import com.xworkz.Override.internal.IceCream;

public class ConeIceCream extends IceCream {

    public ConeIceCream() {
        System.out.println("ConeIceCream: No-arg constructor");
    }

    @Override
    public void melt() {
        System.out.println("ConeIceCream melts faster due to cone heat.");
    }

    public void addToppings(IceCream iceCream) {
        if (iceCream != null) {
            System.out.println("Adding sprinkles and syrup to your ice cream.");
        } else {
            System.out.println("No ice cream to add toppings on.");
        }
    }
}
