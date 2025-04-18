package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Powder {

    private String type;
    private double weight;
    private String fragrance;
    private boolean isTalcFree;

    // No-argument constructor
    public Powder() {
        System.out.println("no argument constructor of Powder");
    }

    // Parameterized constructor
    public Powder(String type, double weight, String fragrance, boolean isTalcFree) {
        this.type = type;
        this.weight = weight;
        this.fragrance = fragrance;
        this.isTalcFree = isTalcFree;
    }

    @Override
    public String toString() {
        return "Powder{type='" + type + "', weight=" + weight + "g, fragrance='" + fragrance + "', isTalcFree=" + isTalcFree + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Powder) {
            Powder other = (Powder) obj;
            if (Objects.equals(this.type, other.type)
                    && this.weight == other.weight
                    && Objects.equals(this.fragrance, other.fragrance)
                    && this.isTalcFree == other.isTalcFree) {
                System.out.println("Powder is matching..");
                return true;
            }
        }
        return false;
    }
}
