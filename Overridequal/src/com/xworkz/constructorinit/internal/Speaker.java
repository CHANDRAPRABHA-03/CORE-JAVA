package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Speaker {

    private String brand;
    private String type;
    private int wattage;
    private String connectivity;

    // No-argument constructor
    public Speaker() {
        System.out.println("no argument constructor of Speaker");
    }

    // Parameterized constructor
    public Speaker(String brand, String type, int wattage, String connectivity) {
        this.brand = brand;
        this.type = type;
        this.wattage = wattage;
        this.connectivity = connectivity;
    }

    @Override
    public String toString() {
        return "Speaker{brand='" + brand + "', type='" + type + "', wattage=" + wattage + "W, connectivity='" + connectivity + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Speaker) {
            Speaker other = (Speaker) obj;
            if (Objects.equals(this.brand, other.brand)
                    && Objects.equals(this.type, other.type)
                    && this.wattage == other.wattage
                    && Objects.equals(this.connectivity, other.connectivity)) {
                System.out.println("Speaker is matching..");
                return true;
            }
        }
        return false;
    }
}
