package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Twinkle {

    private String starType;
    private String color;
    private double brightness;
    private boolean visible;

    // No-argument constructor
    public Twinkle() {
        System.out.println("no argument constructor of Twinkle");
    }

    // Parameterized constructor
    public Twinkle(String starType, String color, double brightness, boolean visible) {
        this.starType = starType;
        this.color = color;
        this.brightness = brightness;
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Twinkle{starType='" + starType + "', color='" + color + "', brightness=" + brightness + ", visible=" + visible + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Twinkle) {
            Twinkle other = (Twinkle) obj;
            if (Objects.equals(this.starType, other.starType)
                    && Objects.equals(this.color, other.color)
                    && this.brightness == other.brightness
                    && this.visible == other.visible) {
                System.out.println("Twinkle is matching..");
                return true;
            }
        }
        return false;
    }
}
