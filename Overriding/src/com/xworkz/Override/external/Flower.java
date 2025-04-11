package com.xworkz.Override.external;

import com.xworkz.Override.internal.Beautiful;

public class Flower extends Beautiful {

    public Flower() {
        System.out.println("Flower: No-arg constructor");
    }

    @Override
    public void showBeauty() {
        System.out.println("The flower is blooming beautifully.");
    }

    public void scent(Beautiful beautiful) {
        if (beautiful != null) {
            System.out.println("The flower has a pleasant fragrance.");
        } else {
            System.out.println("No flower to give scent.");
        }
    }
}
