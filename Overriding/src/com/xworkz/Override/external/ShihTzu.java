package com.xworkz.Override.external;

import com.xworkz.Override.internal.Dog;

public class ShihTzu extends Dog {

    public ShihTzu() {
        System.out.println("ShihTzu: No-arg constructor");
    }

    @Override
    public void bark() {
        System.out.println("ShihTzu: Yap yap! I'm a cute little dog!");
    }

    public void cuddle(Dog dog) {
        if (dog != null) {
            System.out.println("ShihTzu: Cuddling with my human");
        } else {
            System.out.println("ShihTzu: I'm alone...");
        }
    }
}
