package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Tiger {

    private String subspecies;
    private double weight;
    private String stripePattern;
    private String habitat;

    // No-argument constructor
    public Tiger() {
        System.out.println("no argument constructor of Tiger");
    }

    // Parameterized constructor
    public Tiger(String subspecies, double weight, String stripePattern, String habitat) {
        this.subspecies = subspecies;
        this.weight = weight;
        this.stripePattern = stripePattern;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Tiger{subspecies='" + subspecies + "', weight=" + weight + "kg, stripePattern='" + stripePattern + "', habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Tiger) {
            Tiger other = (Tiger) obj;
            if (Objects.equals(this.subspecies, other.subspecies)
                    && this.weight == other.weight
                    && Objects.equals(this.stripePattern, other.stripePattern)
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Tiger is matching..");
                return true;
            }
        }
        return false;
    }
}
