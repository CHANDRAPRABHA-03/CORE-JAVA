package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Pumpkin {

    private String variety;
    private String color;
    private double weight;
    private boolean organic;

    // No-argument constructor
    public Pumpkin() {
        System.out.println("no argument constructor of Pumpkin");
    }

    // Parameterized constructor
    public Pumpkin(String variety, String color, double weight, boolean organic) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.organic = organic;
    }

    @Override
    public String toString() {
        return "Pumpkin{variety='" + variety + "', color='" + color + "', weight=" + weight + ", organic=" + organic + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pumpkin) {
            Pumpkin other = (Pumpkin) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.organic == other.organic) {
                System.out.println("Pumpkin is matching..");
                return true;
            }
        }
        return false;
    }
}
