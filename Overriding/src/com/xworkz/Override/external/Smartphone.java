package com.xworkz.Override.external;

import com.xworkz.Override.internal.Android;

public class Smartphone extends Android {

    public Smartphone() {
        System.out.println("Smartphone: No-arg constructor");
    }

    @Override
    public void operate() {
        System.out.println("Smartphone is running Android 14 with custom UI");
    }

    public void connectToInternet(Android android) {
        if (android != null) {
            System.out.println("Smartphone is connected to the internet");
        } else {
            System.out.println("No device to connect");
        }
    }
}
