package com.java.Encapsulation.internal;

public class GarageUser {
    public void displayGarage() {
        Garage garage = new Garage();

        System.out.println("Garage Name: " + garage.getName());
        System.out.println("Capacity: " + garage.getCapacity());
        System.out.println("Has Car Wash: " + garage.getHasCarWash());
        System.out.println("Location: " + garage.getLocation());
        System.out.println("Number of Staff: " + garage.getNumberOfStaff());

        // Update garage info
        garage.setName("GreenZone Garage");
        garage.setCapacity(50);
        garage.setHasCarWash(false);
        garage.setLocation("Suburban Avenue");
        garage.setNumberOfStaff(12);

        System.out.println("Updated Garage Name: " + garage.getName());
    }
}
