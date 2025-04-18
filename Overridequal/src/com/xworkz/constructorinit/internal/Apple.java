package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Apple {
    private String variety;
    private String color;
    private double weight;
    private boolean isFresh;

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setIsFresh(boolean isFresh) {
        this.isFresh = isFresh;
    }

    @Override
    public String toString() {
        return "Apple{" + "variety='" + variety + "', color='" + color + "', weight=" + weight + "kg, isFresh=" + isFresh + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Apple) {
            Apple other = (Apple) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.isFresh == other.isFresh) {
                System.out.println("Apples are matching. Same freshness!");
                return true;
            }
            System.out.println("Apples are not matching. Different types.");
            return false;
        }
        System.err.println("Invalid object. Not an Apple.");
        return false;
    }
}
