package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Rain {

    private String type;
    private double intensity;
    private boolean isAcidic;
    private String origin;

    // No-argument constructor
    public Rain() {
        System.out.println("no argument constructor of Rain");
    }

    // Parameterized constructor
    public Rain(String type, double intensity, boolean isAcidic, String origin) {
        this.type = type;
        this.intensity = intensity;
        this.isAcidic = isAcidic;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Rain{type='" + type + "', intensity=" + intensity + "mm/hr, isAcidic=" + isAcidic + ", origin='" + origin + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rain) {
            Rain other = (Rain) obj;
            if (Objects.equals(this.type, other.type)
                    && this.intensity == other.intensity
                    && this.isAcidic == other.isAcidic
                    && Objects.equals(this.origin, other.origin)) {
                System.out.println("Rain is matching..");
                return true;
            }
        }
        return false;
    }
}
