package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bag;

public class LaptopBag extends Bag {

    public LaptopBag() {
        System.out.println("LaptopBag: No-arg constructor");
    }

    @Override
    public void carry() {
        System.out.println("Carrying laptop and accessories in LaptopBag");
    }

    public void carryLaptop(Bag bag) {
        if (bag != null) {
            System.out.println("Laptop safely placed in the bag");
        } else {
            System.out.println("Bag is null, cannot carry laptop");
        }
    }
}
