package com.xworkz.Override.external;

import com.xworkz.Override.internal.RemoteCar;

public class Toy extends RemoteCar {

    public Toy() {
        System.out.println("Toy: No-arg constructor");
    }

    @Override
    public void drive() {
        System.out.println("Driving with AI assistance.");
    }

    public void autoPark(RemoteCar car) {
        if (car != null) {
            System.out.println("Toy auto-parking initiated.");
        } else {
            System.out.println("Car not found to auto-park.");
        }
    }
}
