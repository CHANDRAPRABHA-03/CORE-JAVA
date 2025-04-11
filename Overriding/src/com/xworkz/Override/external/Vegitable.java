package com.xworkz.Override.external;

import com.xworkz.Override.internal.Carrot;

public class Vegitable extends Carrot {

    public Vegitable() {
        System.out.println("Vegitable: No-arg constructor");
    }

    @Override
    public void taste() {
        System.out.println("Vegitable: Sweeter and juicier taste");
    }

    public void nutrition(Carrot carrot) {
        if (carrot != null) {
            System.out.println("Vegitable: Rich in Vitamin A and antioxidants");
        } else {
            System.out.println("Vegitable: No carrot found to analyze nutrition");
        }
    }
}
