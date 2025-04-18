package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Banana {

    private String type;
    private String origin;
    private double price;
    private boolean ripe;

    // No-argument constructor
    public Banana() {
        System.out.println("no argument constructor of Banana");
    }

    // Setter methods
    public void setType(String type) {
        this.type = type;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    @Override
    public String toString() {
        return "Banana{type='" + type + "', origin='" + origin + "', price=" + price + ", ripe=" + ripe + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Banana) {
            Banana other = (Banana) obj;
            if (Objects.equals(this.type, other.type)
                    && Objects.equals(this.origin, other.origin)
                    && this.price == other.price
                    && this.ripe == other.ripe) {
                System.out.println("Banana is matching..");
                return true;
            }
            System.out.println("Bananas are not matching.");
            return false;
        }
        System.err.println("Invalid object. Not a Banana.");
        return false;
    }
}
