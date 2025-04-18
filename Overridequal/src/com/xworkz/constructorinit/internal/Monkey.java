package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Monkey {

    private String species;
    private String color;
    private int age;
    private String habitat;

    // No-argument constructor
    public Monkey() {
        System.out.println("no argument constructor of Monkey");
    }

    // Parameterized constructor
    public Monkey(String species, String color, int age, String habitat) {
        this.species = species;
        this.color = color;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Monkey{species='" + species + "', color='" + color + "', age=" + age + ", habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Monkey) {
            Monkey other = (Monkey) obj;
            if (Objects.equals(this.species, other.species)
                    && Objects.equals(this.color, other.color)
                    && this.age == other.age
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Monkey is matching..");
                return true;
            }
        }
        return false;
    }
}
