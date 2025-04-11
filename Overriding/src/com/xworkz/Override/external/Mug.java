package com.xworkz.Override.external;

import com.xworkz.Override.internal.Container;

public class Mug extends Container {

    public Mug() {
        System.out.println("Mug: No-arg constructor");
    }

    @Override
    public void holdLiquid() {
        System.out.println("Mug holds coffee or tea");
    }

    public void handleGrip(Container container) {
        if (container != null) {
            System.out.println("Mug has a handle to grip");
        } else {
            System.out.println("No container passed to check grip");
        }
    }
}
