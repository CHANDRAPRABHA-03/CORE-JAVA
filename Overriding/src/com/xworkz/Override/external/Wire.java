package com.xworkz.Override.external;

import com.xworkz.Override.internal.CableWire;

public class Wire extends CableWire {

    public Wire() {
        System.out.println("Wire: No-arg constructor");
    }

    @Override
    public void transmit() {
        System.out.println("Wire transmits high-definition video and audio.");
    }

    public void qualityCheck(CableWire wire) {
        if (wire != null) {
            System.out.println("Wire is functioning properly.");
        } else {
            System.out.println("Cable not connected.");
        }
    }
}
