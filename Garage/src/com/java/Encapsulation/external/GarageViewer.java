package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Garage;

public class GarageViewer {
    public void viewGarage() {
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Has Car Wash: " + garage.getHasCarWash());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Number of Staff: " + garage.getNumberOfStaff());
    }
}
