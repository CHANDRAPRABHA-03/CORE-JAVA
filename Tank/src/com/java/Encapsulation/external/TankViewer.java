package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Tank;

public class TankViewer {
    public void viewTank() {
        Tank tank = new Tank();

        System.out.println("Tank Model: " + tank.getModel());
        System.out.println("Country of Origin: " + tank.getCountryOfOrigin());
        System.out.println("Crew Size: " + tank.getCrewSize());
        System.out.println("Amphibious: " + tank.getIsAmphibious());
        System.out.println("Weight (tons): " + tank.getWeightInTons());
    }
}
