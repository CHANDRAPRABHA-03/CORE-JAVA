package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Germ {

    private String type;
    private double size;
    private boolean isHarmful;
    private String origin;

    // No-argument constructor
    public Germ() {
        System.out.println("no argument constructor of Germ");
    }

    // Parameterized constructor
    public Germ(String type, double size, boolean isHarmful, String origin) {
        this.type = type;
        this.size = size;
        this.isHarmful = isHarmful;
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Germ{type='" + type + "', size=" + size + "μm, isHarmful=" + isHarmful + ", origin='" + origin + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Germ) {
            Germ other = (Germ) obj;
            if (Objects.equals(this.type, other.type)
                    && this.size == other.size
                    && this.isHarmful == other.isHarmful
                    && Objects.equals(this.origin, other.origin)) {
                System.out.println("Germ is matching..");
                return true;
            }
        }
        return false;
    }
}
