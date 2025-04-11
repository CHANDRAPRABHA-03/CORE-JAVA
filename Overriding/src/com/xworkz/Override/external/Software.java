package com.xworkz.Override.external;

import com.xworkz.Override.internal.Design;

public class Software extends Design {

    public Software() {
        System.out.println("Software: No-arg constructor");
    }

    @Override
    public void create() {
        System.out.println("Software converts design ideas into digital output");
    }

    public void export(Design design) {
        if (design != null) {
            System.out.println("Software exports the design into a usable format");
        } else {
            System.out.println("No design to export");
        }
    }
}
