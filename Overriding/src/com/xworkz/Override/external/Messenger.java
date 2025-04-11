package com.xworkz.Override.external;

import com.xworkz.Override.internal.Message;

public class Messenger extends Message {

    public Messenger() {
        System.out.println("Messenger: No-arg constructor");
    }

    @Override
    public void deliver() {
        System.out.println("Messenger delivers the message physically or digitally");
    }

    public void track(Message message) {
        if (message != null) {
            System.out.println("Messenger is tracking the message's delivery route");
        } else {
            System.out.println("Cannot track — message is missing");
        }
    }
}
