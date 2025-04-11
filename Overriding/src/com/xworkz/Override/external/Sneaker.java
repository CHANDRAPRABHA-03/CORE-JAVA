package com.xworkz.Override.external;

import com.xworkz.Override.internal.Shoe;

public class Sneaker extends Shoe {

    public Sneaker() {
        System.out.println("Sneaker: No-arg constructor");
    }

    @Override
    public void wear() {
        System.out.println("Wearing a comfortable sneaker.");
    }

    public void laceUp(Shoe shoe) {
        if (shoe != null) {
            System.out.println("Lacing up the sneaker securely.");
        } else {
            System.out.println("No shoe to lace up.");
        }
    }
}
