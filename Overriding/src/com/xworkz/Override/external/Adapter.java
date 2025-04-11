package com.xworkz.Override.external;

import com.xworkz.Override.internal.Plug;

public class Adapter extends Plug {

    public Adapter() {
        System.out.println("Adapter: No-arg constructor");
    }

    @Override
    public void providePower() {
        System.out.println("Adapter converts power for a different device");
    }

    public void connectDevice(Plug plug) {
        if (plug != null) {
            System.out.println("Adapter is connected to a device");
        } else {
            System.out.println("No plug to connect");
        }
    }
}
