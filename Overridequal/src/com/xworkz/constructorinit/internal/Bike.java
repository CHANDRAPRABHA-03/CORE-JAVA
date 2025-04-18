package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Bike {

    private String brand;
    private String color;
    private int engineCC;
    private double price;

    // No-argument constructor
    public Bike() {
        System.out.println("no argument constructor of Bike");
    }

    // Parameterized constructor
    public Bike(String brand, String color, int engineCC, double price) {
        this.brand = brand;
        this.color = color;
        this.engineCC = engineCC;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bike{brand='" + brand + "', color='" + color + "', engineCC=" + engineCC + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Bike) {
            Bike other = (Bike) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.color, other.color)
                    && this.engineCC == other.engineCC
                    && this.price == other.price) {
                System.out.println("Bike is matching..");
                return true;
            }
        }
        return false;
    }
}
