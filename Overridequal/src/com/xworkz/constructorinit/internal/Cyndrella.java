package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Cyndrella {

    private String dressColor;
    private String shoeType;
    private int age;
    private String kingdom;

    // No-argument constructor
    public Cyndrella() {
        System.out.println("no argument constructor of Cyndrella");
    }

    // Parameterized constructor
    public Cyndrella(String dressColor, String shoeType, int age, String kingdom) {
        this.dressColor = dressColor;
        this.shoeType = shoeType;
        this.age = age;
        this.kingdom = kingdom;
    }

    @Override
    public String toString() {
        return "Cyndrella{dressColor='" + dressColor + "', shoeType='" + shoeType + "', age=" + age + ", kingdom='" + kingdom + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Cyndrella) {
            Cyndrella other = (Cyndrella) obj;
            if (Objects.equals(this.dressColor, other.dressColor)
                    && Objects.equals(this.shoeType, other.shoeType)
                    && this.age == other.age
                    && Objects.equals(this.kingdom, other.kingdom)) {
                System.out.println("Cyndrella is matching..");
                return true;
            }
        }
        return false;
    }
}
