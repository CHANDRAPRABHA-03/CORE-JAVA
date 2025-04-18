package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Tablet {

    private String brand;
    private String model;
    private double screenSize;
    private boolean wifiEnabled;

    // No-argument constructor
    public Tablet() {
        System.out.println("no argument constructor of Tablet");
    }

    // Parameterized constructor
    public Tablet(String brand, String model, double screenSize, boolean wifiEnabled) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.wifiEnabled = wifiEnabled;
    }

    @Override
    public String toString() {
        return "Tablet{brand='" + brand + "', model='" + model + "', screenSize=" + screenSize + ", wifiEnabled=" + wifiEnabled + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tablet) {
            Tablet other = (Tablet) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.model, other.model)
                    && this.screenSize == other.screenSize
                    && this.wifiEnabled == other.wifiEnabled) {
                System.out.println("Tablet is matching..");
                return true;
            }
        }
        return false;
    }
}
