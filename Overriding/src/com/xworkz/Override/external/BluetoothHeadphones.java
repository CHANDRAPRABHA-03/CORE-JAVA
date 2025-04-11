package com.xworkz.Override.external;

import com.xworkz.Override.internal.Headphones;

public class BluetoothHeadphones extends Headphones {

    public BluetoothHeadphones() {
        System.out.println("BluetoothHeadphones: No-arg constructor");
    }

    @Override
    public void connect() {
        System.out.println("BluetoothHeadphones: Connecting wirelessly via Bluetooth.");
    }

    public void batteryLife(Headphones headphones) {
        if (headphones != null) {
            System.out.println("BluetoothHeadphones: 20 hours of battery life.");
        } else {
            System.out.println("No headphones to check battery life.");
        }
    }
}
