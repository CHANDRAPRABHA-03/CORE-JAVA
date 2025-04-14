package com.xworkz.Override.external;

import com.xworkz.Override.internal.Appliance;

public class Technician {

    public Technician() {
        System.out.println("Technician constructor called");
    }

    public void inspectAppliance(Appliance appliance) {
        if (appliance != null) {
            appliance.start();

            if (appliance instanceof WashingMachine) {
                WashingMachine wm = (WashingMachine) appliance;
                wm.load(appliance);
            } else {
                System.err.println("This appliance is not a WashingMachine");
            }
        } else {
            System.err.println("Appliance is null");
        }
    }
}
