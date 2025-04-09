package com.java.Encapsulation.internal;

public class JetUser {
    public void displayJet() {
        Jet jet = new Jet();

        System.out.println("Model: " + jet.getModel());
        System.out.println("Manufacturer: " + jet.getManufacturer());
        System.out.println("Max Speed: " + jet.getMaxSpeed() + " km/h");
        System.out.println("Seating Capacity: " + jet.getSeatingCapacity());
        System.out.println("Military Jet: " + jet.getIsMilitary());

        // Update jet details
        jet.setModel("Lightning Z");
        jet.setManufacturer("AeroDynamics Ltd.");
        jet.setMaxSpeed(3200.0);
        jet.setSeatingCapacity(1);
        jet.setIsMilitary(false);

        System.out.println("Updated Model: " + jet.getModel());
    }
}
