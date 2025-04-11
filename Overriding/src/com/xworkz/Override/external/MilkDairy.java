package com.xworkz.Override.external;

import com.xworkz.Override.internal.Dairy;

public class MilkDairy extends Dairy {

    public MilkDairy() {
        System.out.println("MilkDairy: No-arg constructor");
    }

    @Override
    public void produce() {
        System.out.println("MilkDairy: Producing pasteurized milk and flavored milk bottles");
    }

    public void supply(Dairy dairy) {
        if (dairy != null) {
            System.out.println("MilkDairy: Supplying fresh milk to homes and stores");
        } else {
            System.out.println("MilkDairy: No dairy instance to supply from");
        }
    }
}
