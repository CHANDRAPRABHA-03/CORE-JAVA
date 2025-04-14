package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bag;

public class Carrier {

    public Carrier() {
        System.out.println("Carrier: No-arg constructor");
    }

    public void useBag(Bag bag) {
        if (bag != null) {
            bag.carry();

            if (bag instanceof LaptopBag) {
                LaptopBag laptopBag = (LaptopBag) bag;
                laptopBag.carryLaptop(bag);
            } else {
                System.err.println("This bag is not a LaptopBag");
            }
        } else {
            System.err.println("Bag is null");
        }
    }
}
