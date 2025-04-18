package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Sesam {

    private String variety;
    private String color;
    private double weight;
    private boolean roasted;

    // No-argument constructor
    public Sesam() {
        System.out.println("no argument constructor of Sesam");
    }

    // Parameterized constructor
    public Sesam(String variety, String color, double weight, boolean roasted) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.roasted = roasted;
    }

    @Override
    public String toString() {
        return "Sesam{variety='" + variety + "', color='" + color + "', weight=" + weight + ", roasted=" + roasted + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sesam) {
            Sesam other = (Sesam) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.roasted == other.roasted) {
                System.out.println("Sesam is matching..");
                return true;
            }
        }
        return false;
    }
}
