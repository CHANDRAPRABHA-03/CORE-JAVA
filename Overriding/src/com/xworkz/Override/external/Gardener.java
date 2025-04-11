package com.xworkz.Override.external;

import com.xworkz.Override.internal.Plant;

public class Gardener extends Plant {

    public Gardener() {
        System.out.println("Gardener: No-arg constructor");
    }

    @Override
    public void grow() {
        System.out.println("Gardener helps the plant grow with water and care");
    }

    public void water(Plant plant) {
        if (plant != null) {
            System.out.println("Gardener is watering the plant");
        } else {
            System.out.println("No plant to water");
        }
    }
}
