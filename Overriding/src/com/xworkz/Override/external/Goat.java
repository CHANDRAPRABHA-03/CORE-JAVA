package com.xworkz.Override.external;

import com.xworkz.Override.internal.Animal;

public class Goat extends Animal {

    public Goat() {
        System.out.println("Goat: No-arg constructor");
    }

    @Override
    public void makeSound() {
        System.out.println("Goat says 'Maa Maa'");
    }

    public void chew(Animal animal) {
        if (animal != null) {
            System.out.println("Goat is chewing grass peacefully");
        } else {
            System.out.println("No animal to chew with");
        }
    }
}
