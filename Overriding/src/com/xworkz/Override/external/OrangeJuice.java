package com.xworkz.Override.external;

import com.xworkz.Override.internal.Juice;

public class OrangeJuice extends Juice {

    public OrangeJuice() {
        System.out.println("OrangeJuice: No-arg constructor");
    }

    @Override
    public void drink() {
        System.out.println("Drinking refreshing orange juice");
    }

    public void serveWithSnack(Juice juice) {
        if (juice != null) {
            System.out.println("OrangeJuice is served with a healthy snack");
        } else {
            System.out.println("No juice to serve with snack");
        }
    }
}
