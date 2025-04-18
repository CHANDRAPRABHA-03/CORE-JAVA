package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Pencil {

    private String brand;
    private String color;
    private double price;
    private boolean sharpened;

    // No-argument constructor
    public Pencil() {
        System.out.println("no argument constructor of Pencil");
    }

    // Parameterized constructor
    public Pencil(String brand, String color, double price, boolean sharpened) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.sharpened = sharpened;
    }

    @Override
    public String toString() {
        return "Pencil{brand='" + brand + "', color='" + color + "', price=" + price + ", sharpened=" + sharpened + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Pencil) {
            Pencil other = (Pencil) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.color, other.color)
                    && this.price == other.price
                    && this.sharpened == other.sharpened) {
                System.out.println("Pencil is matching..");
                return true;
            }
        }
        return false;
    }
}
