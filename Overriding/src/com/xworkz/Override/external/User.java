package com.xworkz.Override.external;

import com.xworkz.Override.internal.Android;

public class User {

    public User() {
        System.out.println("User: No-arg constructor");
    }

    public void useDevice(Android android) {
        if (android != null) {
            android.operate();

            if (android instanceof Smartphone) {
                Smartphone phone = (Smartphone) android;
                phone.connectToInternet(android);
            } else {
                System.err.println("This Android device is not a Smartphone");
            }
        } else {
            System.err.println("Android device is null");
        }
    }
}
