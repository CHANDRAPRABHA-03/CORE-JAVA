package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Milk {

    private String type;
    private double quantity;
    private double fatPercentage;
    private boolean isOrganic;

    // No-argument constructor
    public Milk() {
        System.out.println("no argument constructor of Milk");
    }

    // Parameterized constructor
    public Milk(String type, double quantity, double fatPercentage, boolean isOrganic) {
        this.type = type;
        this.quantity = quantity;
        this.fatPercentage = fatPercentage;
        this.isOrganic = isOrganic;
    }

    @Override
    public String toString() {
        return "Milk{type='" + type + "', quantity=" + quantity + "L, fatPercentage=" + fatPercentage + "%, isOrganic=" + isOrganic + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Milk) {
            Milk other = (Milk) obj;
            if (Objects.equals(this.type, other.type)
                    && this.quantity == other.quantity
                    && this.fatPercentage == other.fatPercentage
                    && this.isOrganic == other.isOrganic) {
                System.out.println("Milk is matching..");
                return true;
            }
        }
        return false;
    }
}
