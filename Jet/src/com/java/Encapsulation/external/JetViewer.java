package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Jet;

public class JetViewer {
    public void viewJet() {
        Jet jet = new Jet();

        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Seating Capacity: " + jet.getSeatingCapacity());
        System.out.println("Military Jet: " + jet.getIsMilitary());
    }
}
