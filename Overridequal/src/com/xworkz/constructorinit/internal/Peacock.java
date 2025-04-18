package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Peacock {

    private String color;
    private String species;
    private double height;
    private boolean dancing;

    // No-argument constructor
    public Peacock() {
        System.out.println("no argument constructor of Peacock");
    }

    // Parameterized constructor
    public Peacock(String color, String species, double height, boolean dancing) {
        this.color = color;
        this.species = species;
        this.height = height;
        this.dancing = dancing;
    }

    @Override
    public String toString() {
        return "Peacock{color='" + color + "', species='" + species + "', height=" + height + ", dancing=" + dancing + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Peacock) {
            Peacock other = (Peacock) obj;
            if (Objects.equals(this.color, other.color)
                    && Objects.equals(this.species, other.species)
                    && this.height == other.height
                    && this.dancing == other.dancing) {
                System.out.println("Peacock is matching..");
                return true;
            }
        }
        return false;
    }
}
