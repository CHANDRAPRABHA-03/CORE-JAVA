package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Syrup {

    private String flavor;
    private String color;
    private double volume;
    private boolean sugarFree;

    // No-argument constructor
    public Syrup() {
        System.out.println("no argument constructor of Syrup");
    }

    // Parameterized constructor
    public Syrup(String flavor, String color, double volume, boolean sugarFree) {
        this.flavor = flavor;
        this.color = color;
        this.volume = volume;
        this.sugarFree = sugarFree;
    }

    @Override
    public String toString() {
        return "Syrup{flavor='" + flavor + "', color='" + color + "', volume=" + volume + ", sugarFree=" + sugarFree + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Syrup) {
            Syrup other = (Syrup) obj;
            if (Objects.equals(this.flavor, other.flavor)
                    && Objects.equals(this.color, other.color)
                    && this.volume == other.volume
                    && this.sugarFree == other.sugarFree) {
                System.out.println("Syrup is matching..");
                return true;
            }
        }
        return false;
    }
}
