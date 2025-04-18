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

    // Parameterized constructor
    public Banana(String type, String origin, double price, boolean ripe) {
        this.type = type;
        this.origin = origin;
        this.price = price;
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
        }
        return false;
    }
}
