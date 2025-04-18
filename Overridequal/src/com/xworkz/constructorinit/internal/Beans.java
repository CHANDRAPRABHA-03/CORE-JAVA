package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Beans {

    private String variety;
    private String color;
    private double weight;
    private boolean fresh;

    // No-argument constructor
    public Beans() {
        System.out.println("no argument constructor of Beans");
    }

    // Parameterized constructor
    public Beans(String variety, String color, double weight, boolean fresh) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
        this.fresh = fresh;
    }

    @Override
    public String toString() {
        return "Beans{variety='" + variety + "', color='" + color + "', weight=" + weight + ", fresh=" + fresh + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Beans) {
            Beans other = (Beans) obj;
            if (Objects.equals(this.variety, other.variety)
                    && Objects.equals(this.color, other.color)
                    && this.weight == other.weight
                    && this.fresh == other.fresh) {
                System.out.println("Beans are matching..");
                return true;
            }
        }
        return false;
    }
}
