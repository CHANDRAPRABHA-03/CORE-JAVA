package com.xworkz.Override.external;

import com.xworkz.Override.internal.Watch;

public class SmartWatch extends Watch {

    public SmartWatch() {
        System.out.println("SmartWatch: No-arg constructor");
    }

    @Override
    public void showTime() {
        System.out.println("SmartWatch shows time in digital format");
    }

    public void trackFitness(Watch watch) {
        if (watch != null) {
            System.out.println("Tracking fitness activities using SmartWatch");
        } else {
            System.out.println("Watch is null, cannot track fitness");
        }
    }
}
