package com.xworkz.Override.external;

import com.xworkz.Override.internal.Carrot;

public class Farm {

    public Farm() {
        System.out.println("Farmer: No-arg constructor");
    }

    public void analyzeTaste(Carrot carrot) {
        if (carrot != null) {
            carrot.taste();

            if (carrot instanceof Vegitables) {
                Vegitables vegetables = (Vegitables) carrot;
                vegetables.nutrition(carrot);
            } else {
                System.out.println("This is just a Carrot, no nutrition analysis.");
            }
        } else {
            System.out.println("No carrot to analyze.");
        }
    }
}
