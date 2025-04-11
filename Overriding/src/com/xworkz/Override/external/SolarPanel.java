package com.xworkz.Override.external;

import com.xworkz.Override.internal.Sun;

public class SolarPanel extends Sun {

    public SolarPanel() {
        System.out.println("SolarPanel: No-arg constructor");
    }

    @Override
    public void radiate() {
        System.out.println("SolarPanel absorbs solar energy and generates electricity");
    }

    public void charge(Sun sun) {
        if (sun != null) {
            System.out.println("SolarPanel is charging using the energy from the sun");
        } else {
            System.out.println("No sun — no power generation");
        }
    }
}
