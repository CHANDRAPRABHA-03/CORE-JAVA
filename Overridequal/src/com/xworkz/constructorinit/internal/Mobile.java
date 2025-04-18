package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Mobile {

    private String brand;
    private String model;
    private double price;
    private boolean is5GEnabled;

    // No-argument constructor
    public Mobile() {
        System.out.println("no argument constructor of Mobile");
    }

    // Parameterized constructor
    public Mobile(String brand, String model, double price, boolean is5GEnabled) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.is5GEnabled = is5GEnabled;
    }

    @Override
    public String toString() {
        return "Mobile{brand='" + brand + "', model='" + model + "', price=" + price + ", is5GEnabled=" + is5GEnabled + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mobile) {
            Mobile other = (Mobile) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.model, other.model)
                    && this.price == other.price
                    && this.is5GEnabled == other.is5GEnabled) {
                System.out.println("Mobile is matching..");
                return true;
            }
        }
        return false;
    }
}
