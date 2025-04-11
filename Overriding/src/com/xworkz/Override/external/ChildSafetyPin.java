package com.xworkz.Override.external;

import com.xworkz.Override.internal.SafetyPin;

public class ChildSafetyPin extends SafetyPin {

    public ChildSafetyPin() {
        System.out.println("ChildSafetyPin: No-arg constructor");
    }

    @Override
    public void lock() {
        System.out.println("ChildSafetyPin: Locking with extra safety features.");
    }

    public void secure(SafetyPin pin) {
        if (pin != null) {
            System.out.println("ChildSafetyPin: Ensuring the safety pin is secured and childproof.");
        } else {
            System.out.println("No safety pin to secure.");
        }
    }
}
