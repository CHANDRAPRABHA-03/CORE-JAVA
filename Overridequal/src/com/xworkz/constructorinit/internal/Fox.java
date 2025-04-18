package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Fox {

    private String species;
    private double weight;
    private String color;
    private String habitat;

    // No-argument constructor
    public Fox() {
        System.out.println("no argument constructor of Fox");
    }

    // Parameterized constructor
    public Fox(String species, double weight, String color, String habitat) {
        this.species = species;
        this.weight = weight;
        this.color = color;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Fox{species='" + species + "', weight=" + weight + "kg, color='" + color + "', habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Fox) {
            Fox other = (Fox) obj;
            if (Objects.equals(this.species, other.species)
                    && this.weight == other.weight
                    && Objects.equals(this.color, other.color)
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Fox is matching..");
                return true;
            }
        }
        return false;
    }
}
