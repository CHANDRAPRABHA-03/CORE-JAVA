package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Apple {

    private String variety;
    private String color;
    private double weight;
    private boolean isFresh;

    // No-argument constructor
    public Apple() {
        System.out.println("no argument constructor of Apple");
    }

    // Parameterized constructor
    public Apple(String variety, String color, double weight, boolean isFresh) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.isFresh = isFresh;
    }

    @Override
    public String toString() {
        return "Apple{variety='" + variety + "', color='" + color + "', weight=" + weight + ", isFresh=" + isFresh + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Apple) {
            Apple other = (Apple) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.isFresh == other.isFresh) {
                System.out.println("Apple is matching..");
                return true;
            }
        }
        return false;
    }
}
