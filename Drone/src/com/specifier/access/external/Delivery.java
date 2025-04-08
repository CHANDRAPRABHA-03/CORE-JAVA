package com.specifier.access.external;

import com.specifier.access.internal.Drone;

public class Delivery {

    public Delivery() {
        System.out.println("Running Delivery constructor");
    }

    public void droneAccessExternal() {
        System.out.println("Accessing public methods of Drone from external package:");
        Drone drone = new Drone();
        drone.flightController();
    }
}
