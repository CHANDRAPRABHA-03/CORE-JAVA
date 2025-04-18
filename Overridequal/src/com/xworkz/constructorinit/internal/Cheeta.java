package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Cheeta {

    private String type;
    private double speed;
    private String spotPattern;
    private String region;

    // No-argument constructor
    public Cheeta() {
        System.out.println("no argument constructor of Cheeta");
    }

    // Parameterized constructor
    public Cheeta(String type, double speed, String spotPattern, String region) {
        this.type = type;
        this.speed = speed;
        this.spotPattern = spotPattern;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Cheeta{type='" + type + "', speed=" + speed + "km/h, spotPattern='" + spotPattern + "', region='" + region + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cheeta) {
            Cheeta other = (Cheeta) obj;
            if (Objects.equals(this.type, other.type)
                    && this.speed == other.speed
                    && Objects.equals(this.spotPattern, other.spotPattern)
                    && Objects.equals(this.region, other.region)) {
                System.out.println("Cheeta is matching..");
                return true;
            }
        }
        return false;
    }
}
