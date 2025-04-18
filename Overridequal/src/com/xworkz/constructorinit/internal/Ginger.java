package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Ginger {

    private String variety;
    private String origin;
    private double weight;
    private boolean fresh;

    // No-argument constructor
    public Ginger() {
        System.out.println("no argument constructor of Ginger");
    }

    // Parameterized constructor
    public Ginger(String variety, String origin, double weight, boolean fresh) {
        this.variety = variety;
        this.origin = origin;
        this.weight = weight;
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Ginger{variety='" + variety + "', origin='" + origin + "', weight=" + weight + ", fresh=" + fresh + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Ginger) {
            Ginger other = (Ginger) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.origin, other.origin)
                    && this.weight == other.weight
                    && this.fresh == other.fresh) {
                System.out.println("Ginger is matching..");
                return true;
            }
        }
        return false;
    }
}
