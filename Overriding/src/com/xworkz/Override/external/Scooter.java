package com.xworkz.Override.external;

import com.xworkz.Override.internal.Vehicle;

public class Scooter extends Vehicle {

    public Scooter() {
        System.out.println("Scooter: No-arg constructor");
    }

    @Override
    public void start() {
        System.out.println("Scooter starts with self-start or kick-start");
    }

    public void kickStart(Vehicle vehicle) {
        if (vehicle != null) {
            System.out.println("Scooter is using kick-start method");
        } else {
            System.out.println("Cannot kick-start a null vehicle");
        }
    }
}
