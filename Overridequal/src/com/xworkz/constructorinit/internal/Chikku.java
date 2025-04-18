package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Chikku {

    private String variety;
    private String origin;
    private double weight;
    private boolean ripe;

    // No-argument constructor
    public Chikku() {
        System.out.println("no argument constructor of Chikku");
    }

    // Parameterized constructor
    public Chikku(String variety, String origin, double weight, boolean ripe) {
        this.variety = variety;
        this.origin = origin;
        this.weight = weight;
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Chikku{variety='" + variety + "', origin='" + origin + "', weight=" + weight + ", ripe=" + ripe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Chikku) {
            Chikku other = (Chikku) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.origin, other.origin)
                    && this.weight == other.weight
                    && this.ripe == other.ripe) {
                System.out.println("Chikku is matching..");
                return true;
            }
        }
        return false;
    }
}
