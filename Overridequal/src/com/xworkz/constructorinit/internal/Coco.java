package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Coco {

    private String type;
    private String origin;
    private double weight;
    private boolean tender;

    // No-argument constructor
    public Coco() {
        System.out.println("no argument constructor of Coco");
    }

    // Parameterized constructor
    public Coco(String type, String origin, double weight, boolean tender) {
        this.type = type;
        this.origin = origin;
        this.weight = weight;
        this.tender = tender;
    }

    @Override
    public String toString() {
        return "Coco{type='" + type + "', origin='" + origin + "', weight=" + weight + ", tender=" + tender + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj!= null && obj instanceof Coco) {
            Coco other = (Coco) obj;
            if (Objects.equals(this.type, other.type)
                    && Objects.equals(this.origin, other.origin)
                    && this.weight == other.weight
                    && this.tender == other.tender) {
                System.out.println("Coco is matching..");
                return true;
            }
        }
        return false;
    }
}
