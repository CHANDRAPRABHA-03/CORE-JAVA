package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Jackfruit {

    private String variety;
    private String color;
    private double weight;
    private boolean ripe;

    // No-argument constructor
    public Jackfruit() {
        System.out.println("no argument constructor of Jackfruit");
    }

    // Parameterized constructor
    public Jackfruit(String variety, String color, double weight, boolean ripe) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Jackfruit{variety='" + variety + "', color='" + color + "', weight=" + weight + ", ripe=" + ripe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Jackfruit) {
            Jackfruit other = (Jackfruit) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.ripe == other.ripe) {
                System.out.println("Jackfruit is matching..");
                return true;
            }
        }
        return false;
    }
}
