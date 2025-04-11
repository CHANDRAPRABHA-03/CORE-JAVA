package com.xworkz.Override.external;

import com.xworkz.Override.internal.Signal;

public class Network extends Signal {

    public Network() {
        System.out.println("Network: No-arg constructor");
    }

    @Override
    public void transmit() {
        System.out.println("Network handles multiple signals across the system");
    }

    public void connect(Signal signal) {
        if (signal != null) {
            System.out.println("Network is establishing a connection with the signal");
        } else {
            System.out.println("No signal detected — connection failed");
        }
    }
}
