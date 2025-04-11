package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mouse;

public class WirelessMouse extends Mouse {

    public WirelessMouse() {
        System.out.println("WirelessMouse: No-arg constructor");
    }

    @Override
    public void click() {
        System.out.println("Clicking using a wireless mouse.");
    }

    public void connect(Mouse mouse) {
        if (mouse != null) {
            System.out.println("Wireless mouse is connected.");
        } else {
            System.out.println("No mouse found to connect.");
        }
    }
}
