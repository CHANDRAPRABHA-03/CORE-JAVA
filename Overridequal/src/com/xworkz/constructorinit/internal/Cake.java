package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Cake {

    // Instance variables should be declared at class level
    private String color;
    private int cost;
    private String brand;
    private String material;

    // No-argument constructor
    public Cake() {
        System.out.println("no argument constructor");
    }

    // Parameterized constructor
    public Cake(String color, int cost, String brand, String material) {
        this.color = color;
        this.cost = cost;
        this.brand = brand;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Cake{color='" + color + "', cost=" + cost + ", brand='" + brand + "', material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cake) {
            Cake other = (Cake) obj;
            if (Objects.equals(this.color, other.color)
                    && this.cost == other.cost
                    && Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.material, other.material)) {
                System.out.println("Cake is matching..");
                return true;
            }
        }
        return false;
    }
}
