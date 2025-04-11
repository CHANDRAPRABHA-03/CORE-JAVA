package com.xworkz.Override.external;

import com.xworkz.Override.internal.Machine;

public class Operator extends Machine {

    public Operator() {
        System.out.println("Operator: No-arg constructor");
    }

    @Override
    public void operate() {
        System.out.println("Operator is controlling the machine for precise work");
    }

    public void maintain(Machine machine) {
        if (machine != null) {
            System.out.println("Operator is maintaining the machine for optimal performance");
        } else {
            System.out.println("No machine to maintain");
        }
    }
}
