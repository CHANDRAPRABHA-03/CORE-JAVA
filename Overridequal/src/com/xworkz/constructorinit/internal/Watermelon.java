package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Watermelon {

    private String variety;
    private String color;
    private double weight;
    private boolean seedless;

    // No-argument constructor
    public Watermelon() {
        System.out.println("no argument constructor of Watermelon");
    }

    // Parameterized constructor
    public Watermelon(String variety, String color, double weight, boolean seedless) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.seedless = seedless;
    }

    @Override
    public String toString() {
        return "Watermelon{variety='" + variety + "', color='" + color + "', weight=" + weight + ", seedless=" + seedless + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Watermelon) {
            Watermelon other = (Watermelon) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.seedless == other.seedless) {
                System.out.println("Watermelon is matching..");
                return true;
            }
        }
        return false;
    }
}
