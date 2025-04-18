package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Clip {

    private String type;
    private String color;
    private double length;
    private String material;

    // No-argument constructor
    public Clip() {
        System.out.println("no argument constructor of Clip");
    }

    // Parameterized constructor
    public Clip(String type, String color, double length, String material) {
        this.type = type;
        this.color = color;
        this.length = length;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clip{type='" + type + "', color='" + color + "', length=" + length + "cm, material='" + material + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Clip) {
            Clip other = (Clip) obj;
            if (Objects.equals(this.type, other.type)
                    && Objects.equals(this.color, other.color)
                    && this.length == other.length
                    && Objects.equals(this.material, other.material)) {
                System.out.println("Clip is matching..");
                return true;
            }
        }
        return false;
    }
}
