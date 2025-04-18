package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Sparrow {

    private String species;
    private String color;
    private double wingspan;
    private String habitat;

    // No-argument constructor
    public Sparrow() {
        System.out.println("no argument constructor of Sparrow");
    }

    // Parameterized constructor
    public Sparrow(String species, String color, double wingspan, String habitat) {
        this.species = species;
        this.color = color;
        this.wingspan = wingspan;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Sparrow{species='" + species + "', color='" + color + "', wingspan=" + wingspan + "cm, habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sparrow) {
            Sparrow other = (Sparrow) obj;
            if (Objects.equals(this.species, other.species)
                    && Objects.equals(this.color, other.color)
                    && this.wingspan == other.wingspan
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Sparrow is matching..");
                return true;
            }
        }
        return false;
    }
}
