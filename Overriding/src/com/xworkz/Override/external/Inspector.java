package com.xworkz.Override.external;

import com.xworkz.Override.internal.CableWire;

public class Inspector {
    public Inspector() {
        System.out.println("Inspector: No-arg constructor");
    }

    public void inspectWire(CableWire wire) {
        if (wire != null) {
            wire.transmit();

            if (wire instanceof Wire) {
                Wire specificWire = (Wire) wire;
                specificWire.qualityCheck(wire);
            } else {
                System.err.println("This is not a Wire, it's just a CableWire.");
            }
        } else {
            System.err.println("Wire is null, cannot inspect.");
        }
    }
}
