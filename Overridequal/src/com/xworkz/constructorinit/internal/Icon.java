package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Icon {

    private String name;
    private String symbol;
    private String color;
    private boolean isActive;

    // No-argument constructor
    public Icon() {
        System.out.println("no argument constructor of Icon");
    }

    // Parameterized constructor
    public Icon(String name, String symbol, String color, boolean isActive) {
        this.name = name;
        this.symbol = symbol;
        this.color = color;
        this.isActive = isActive;
    }

    @Override
    public String toString() {
        return "Icon{name='" + name + "', symbol='" + symbol + "', color='" + color + "', isActive=" + isActive + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Icon) {
            Icon other = (Icon) obj;
            if (Objects.equals(this.name, other.name)
                    && Objects.equals(this.symbol, other.symbol)
                    && Objects.equals(this.color, other.color)
                    && this.isActive == other.isActive) {
                System.out.println("Icon is matching..");
                return true;
            }
        }
        return false;
    }
}
