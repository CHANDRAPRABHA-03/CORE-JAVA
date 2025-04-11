package com.xworkz.Override.external;

import com.xworkz.Override.internal.Appliance;

public class WashingMachine extends Appliance {

    public WashingMachine() {
        System.out.println("WashingMachine constructor called");
    }

    @Override
    public void start() {
        System.out.println("Washing clothes in the machine");
    }

    public void load(Appliance appliance) {
        if (appliance != null) {
            System.out.println("Loading clothes into WashingMachine");
        } else {
            System.out.println("Appliance is null, cannot load");
        }
    }
}
