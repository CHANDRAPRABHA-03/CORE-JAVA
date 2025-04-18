package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Purple {

    private String shade;
    private double intensity;
    private boolean isBright;
    private String origin;

    // No-argument constructor
    public Purple() {
        System.out.println("no argument constructor of Purple");
    }

    // Parameterized constructor
    public Purple(String shade, double intensity, boolean isBright, String origin) {
        this.shade = shade;
        this.intensity = intensity;
        this.isBright = isBright;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Purple{shade='" + shade + "', intensity=" + intensity + ", isBright=" + isBright + ", origin='" + origin + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Purple) {
            Purple other = (Purple) obj;
            if (Objects.equals(this.shade, other.shade)
                    && this.intensity == other.intensity
                    && this.isBright == other.isBright
                    && Objects.equals(this.origin, other.origin)) {
                System.out.println("Purple is matching..");
                return true;
            }
        }
        return false;
    }
}
