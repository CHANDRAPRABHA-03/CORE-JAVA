package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Perfume {

    private String brand;
    private String fragrance;
    private double quantity;
    private boolean isLongLasting;

    // No-argument constructor
    public Perfume() {
        System.out.println("no argument constructor of Perfume");
    }

    // Parameterized constructor
    public Perfume(String brand, String fragrance, double quantity, boolean isLongLasting) {
        this.brand = brand;
        this.fragrance = fragrance;
        this.quantity = quantity;
        this.isLongLasting = isLongLasting;
    }

    @Override
    public String toString() {
        return "Perfume{brand='" + brand + "', fragrance='" + fragrance + "', quantity=" + quantity + "ml, isLongLasting=" + isLongLasting + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Perfume) {
            Perfume other = (Perfume) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.fragrance, other.fragrance)
                    && this.quantity == other.quantity
                    && this.isLongLasting == other.isLongLasting) {
                System.out.println("Perfume is matching..");
                return true;
            }
        }
        return false;
    }
}
