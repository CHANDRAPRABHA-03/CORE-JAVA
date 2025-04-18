package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Lion {

    private String species;
    private double weight;
    private String maneColor;
    private String habitat;

    // No-argument constructor
    public Lion() {
        System.out.println("no argument constructor of Lion");
    }

    // Parameterized constructor
    public Lion(String species, double weight, String maneColor, String habitat) {
        this.species = species;
        this.weight = weight;
        this.maneColor = maneColor;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Lion{species='" + species + "', weight=" + weight + "kg, maneColor='" + maneColor + "', habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Lion) {
            Lion other = (Lion) obj;
            if (Objects.equals(this.species, other.species)
                    && this.weight == other.weight
                    && Objects.equals(this.maneColor, other.maneColor)
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Lion is matching..");
                return true;
            }
        }
        return false;
    }
}
