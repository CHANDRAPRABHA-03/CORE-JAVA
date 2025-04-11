package com.xworkz.Override.external;

import com.xworkz.Override.internal.Computer;

public class Programmer extends Computer {

    public Programmer() {
        System.out.println("Programmer: No-arg constructor");
    }

    @Override
    public void boot() {
        System.out.println("Programmer is booting the computer and setting up the IDE");
    }

    public void writeCode(Computer computer) {
        if (computer != null) {
            System.out.println("Programmer is writing code on the computer");
        } else {
            System.out.println("No computer to write code on");
        }
    }
}
