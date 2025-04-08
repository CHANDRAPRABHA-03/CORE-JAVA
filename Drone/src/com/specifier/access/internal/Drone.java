package com.specifier.access.internal;

public class Drone {

    public Drone() {
        System.out.println("In no-arg Drone constructor running");
    }

    public void flightController() {
        System.out.println("Running public flightController method");
    }

    void cameraModule() {
        System.out.println("Running package-default cameraModule method");
    }

    private void batteryStatus() {
        System.out.println("Running private batteryStatus method");
    }
}
