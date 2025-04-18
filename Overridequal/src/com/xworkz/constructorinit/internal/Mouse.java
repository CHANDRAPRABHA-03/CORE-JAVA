package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Mouse {

    private String brand;
    private String type;
    private double weight;
    private boolean wireless;

    // No-argument constructor
    public Mouse() {
        System.out.println("no argument constructor of Mouse");
    }

    // Parameterized constructor
    public Mouse(String brand, String type, double weight, boolean wireless) {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.wireless = wireless;
    }

    @Override
    public String toString() {
        return "Mouse{brand='" + brand + "', type='" + type + "', weight=" + weight + ", wireless=" + wireless + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mouse) {
            Mouse other = (Mouse) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.type, other.type)
                    && this.weight == other.weight
                    && this.wireless == other.wireless) {
                System.out.println("Mouse is matching..");
                return true;
            }
        }
        return false;
    }
}
