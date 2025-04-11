package com.xworkz.Override.external;

import com.xworkz.Override.internal.Power;

public class Battery extends Power {

    public Battery() {
        System.out.println("Battery: No-arg constructor");
    }

    @Override
    public void supply() {
        System.out.println("Battery supplies stored power when needed");
    }

    public void recharge(Power power) {
        if (power != null) {
            System.out.println("Battery is recharging with power input");
        } else {
            System.out.println("Recharge failed — no power source available");
        }
    }
}
