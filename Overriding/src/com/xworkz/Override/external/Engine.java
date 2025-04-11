package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fuel;

public class Engine extends Fuel {

    public Engine() {
        System.out.println("Engine: No-arg constructor");
    }

    @Override
    public void ignite() {
        System.out.println("Engine ignites the fuel and powers the vehicle");
    }

    public void run(Fuel fuel) {
        if (fuel != null) {
            System.out.println("Engine is running smoothly using the fuel");
        } else {
            System.out.println("No fuel — engine can't run");
        }
    }
}
