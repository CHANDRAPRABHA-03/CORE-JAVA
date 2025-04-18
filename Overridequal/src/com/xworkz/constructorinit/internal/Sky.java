package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Sky {

    private String color;
    private String timeOfDay;
    private int cloudDensity;
    private String weatherCondition;

    // No-argument constructor
    public Sky() {
        System.out.println("no argument constructor of Sky");
    }

    // Parameterized constructor
    public Sky(String color, String timeOfDay, int cloudDensity, String weatherCondition) {
        this.color = color;
        this.timeOfDay = timeOfDay;
        this.cloudDensity = cloudDensity;
        this.weatherCondition = weatherCondition;
    }

    @Override
    public String toString() {
        return "Sky{color='" + color + "', timeOfDay='" + timeOfDay + "', cloudDensity=" + cloudDensity + "%, weatherCondition='" + weatherCondition + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Sky) {
            Sky other = (Sky) obj;
            if (Objects.equals(this.color, other.color)
                    && Objects.equals(this.timeOfDay, other.timeOfDay)
                    && this.cloudDensity == other.cloudDensity
                    && Objects.equals(this.weatherCondition, other.weatherCondition)) {
                System.out.println("Sky is matching..");
                return true;
            }
        }
        return false;
    }
}
