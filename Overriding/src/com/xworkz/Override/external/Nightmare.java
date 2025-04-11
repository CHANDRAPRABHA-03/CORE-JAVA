package com.xworkz.Override.external;

import com.xworkz.Override.internal.Dream;

public class Nightmare extends Dream {

    public Nightmare() {
        System.out.println("Nightmare: No-arg constructor");
    }

    @Override
    public void experience() {
        System.out.println("Experiencing a terrifying nightmare!");
    }

    public void wakeUp(Dream dream) {
        if (dream != null) {
            System.out.println("Woke up sweating after the nightmare...");
        } else {
            System.out.println("No dream to wake up from");
        }
    }
}
