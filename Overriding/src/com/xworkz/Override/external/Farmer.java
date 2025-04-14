package com.xworkz.Override.external;

import com.xworkz.Override.internal.Animal;

public class Farmer {

    public Farmer() {
        System.out.println("Farmer: No-arg constructor");
    }

    public void careForAnimal(Animal animal) {
        if (animal != null) {
            animal.makeSound();

            if (animal instanceof Goat) {
                Goat goat = (Goat) animal;
                goat.chew(animal);
            } else {
                System.err.println("This animal is not a Goat");
            }
        } else {
            System.err.println("Animal is null");
        }
    }
}
