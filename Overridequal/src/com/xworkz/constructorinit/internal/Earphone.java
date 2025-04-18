package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Earphone {

    private String brand;
    private String type;
    private boolean wireless;
    private double price;

    // No-argument constructor
    public Earphone() {
        System.out.println("no argument constructor of Earphone");
    }

    // Parameterized constructor
    public Earphone(String brand, String type, boolean wireless, double price) {
        this.brand = brand;
        this.type = type;
        this.wireless = wireless;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Earphone{brand='" + brand + "', type='" + type + "', wireless=" + wireless + ", price=" + price + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Earphone) {
            Earphone other = (Earphone) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.type, other.type)
                    && this.wireless == other.wireless
                    && this.price == other.price) {
                System.out.println("Earphone is matching..");
                return true;
            }
        }
        return false;
    }
}
