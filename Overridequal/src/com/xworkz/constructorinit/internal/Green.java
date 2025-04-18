package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Green {

    private String shade;
    private double intensity;
    private boolean isNatural;
    private String origin;

    // No-argument constructor
    public Green() {
        System.out.println("no argument constructor of Green");
    }

    // Parameterized constructor
    public Green(String shade, double intensity, boolean isNatural, String origin) {
        this.shade = shade;
        this.intensity = intensity;
        this.isNatural = isNatural;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Green{shade='" + shade + "', intensity=" + intensity + ", isNatural=" + isNatural + ", origin='" + origin + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Green) {
            Green other = (Green) obj;
            if (Objects.equals(this.shade, other.shade)
                    && this.intensity == other.intensity
                    && this.isNatural == other.isNatural
                    && Objects.equals(this.origin, other.origin)) {
                System.out.println("Green is matching..");
                return true;
            }
        }
        return false;
    }
}
