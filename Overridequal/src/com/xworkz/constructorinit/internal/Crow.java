package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Crow {

    private String species;
    private String color;
    private double wingspan;
    private String sound;

    // No-argument constructor
    public Crow() {
        System.out.println("no argument constructor of Crow");
    }

    // Parameterized constructor
    public Crow(String species, String color, double wingspan, String sound) {
        this.species = species;
        this.color = color;
        this.wingspan = wingspan;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Crow{species='" + species + "', color='" + color + "', wingspan=" + wingspan + "cm, sound='" + sound + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Crow) {
            Crow other = (Crow) obj;
            if (Objects.equals(this.species, other.species)
                    && Objects.equals(this.color, other.color)
                    && this.wingspan == other.wingspan
                    && Objects.equals(this.sound, other.sound)) {
                System.out.println("Crow is matching..");
                return true;
            }
        }
        return false;
    }
}
