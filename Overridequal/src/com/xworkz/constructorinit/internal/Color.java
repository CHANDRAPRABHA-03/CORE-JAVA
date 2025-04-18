package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Color {

    private String name;
    private String hexCode;
    private int rgbValue;
    private boolean isPrimary;

    // No-argument constructor
    public Color() {
        System.out.println("no argument constructor of Color");
    }

    // Parameterized constructor
    public Color(String name, String hexCode, int rgbValue, boolean isPrimary) {
        this.name = name;
        this.hexCode = hexCode;
        this.rgbValue = rgbValue;
        this.isPrimary = isPrimary;
    }

    @Override
    public String toString() {
        return "Color{name='" + name + "', hexCode='" + hexCode + "', rgbValue=" + rgbValue + ", isPrimary=" + isPrimary + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Color) {
            Color other = (Color) obj;
            if (Objects.equals(this.name, other.name)
                    && Objects.equals(this.hexCode, other.hexCode)
                    && this.rgbValue == other.rgbValue
                    && this.isPrimary == other.isPrimary) {
                System.out.println("Color is matching..");
                return true;
            }
        }
        return false;
    }
}
