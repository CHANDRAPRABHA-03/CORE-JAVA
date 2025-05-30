package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Pineapple {

    private String variety;
    private String color;
    private double weight;
    private boolean ripe;

    // No-argument constructor
    public Pineapple() {
        System.out.println("no argument constructor of Pineapple");
    }

    // Parameterized constructor
    public Pineapple(String variety, String color, double weight, boolean ripe) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Pineapple{variety='" + variety + "', color='" + color + "', weight=" + weight + ", ripe=" + ripe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pineapple) {
            Pineapple other = (Pineapple) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.ripe == other.ripe) {
                System.out.println("Pineapple is matching..");
                return true;
            }
        }
        return false;
    }
}
