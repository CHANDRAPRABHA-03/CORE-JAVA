package com.java.Encapsulation.internal;

public class TankUser {
    public void displayTank() {
        Tank tank = new Tank();

        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country of Origin: " + tank.getCountryOfOrigin());
        System.out.println("Crew Size: " + tank.getCrewSize());
        System.out.println("Amphibious: " + tank.getIsAmphibious());
        System.out.println("Weight (tons): " + tank.getWeightInTons());

        // Modify details
        tank.setModel("Abrams M1A2");
        tank.setCountryOfOrigin("USA");
        tank.setCrewSize(4);
        tank.setIsAmphibious(true);
        tank.setWeightInTons(62.0);

        System.out.println("Updated Tank Model: " + tank.getModel());
    }
}

