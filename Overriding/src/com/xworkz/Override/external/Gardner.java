package com.xworkz.Override.external;

import com.xworkz.Override.internal.Beautiful;

public class Gardner {

    public Gardner() {
        System.out.println("Gardener: No-arg constructor");
    }

    public void admire(Beautiful beautiful) {
        if (beautiful != null) {
            beautiful.showBeauty();

            if (beautiful instanceof Flower) {
                Flower flower = (Flower) beautiful;
                flower.scent(beautiful);
            } else {
                System.err.println("This beautiful object is not a Flower");
            }
        } else {
            System.err.println("Beautiful object is null");
        }
    }
}
