package com.specifier.access.internal;

public class Surveillance {

    public Surveillance() {
        System.out.println("Running Surveillance constructor");
    }

    public void droneOperations() {
        System.out.println("Accessing public and default methods from internal package:");
        Drone drone = new Drone();
        drone.flightController();  // public - accessible
        drone.cameraModule();      // package-private - accessible within same package
        // drone.batteryStatus();  // private - NOT accessible
    }
}

