package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Kingdom {

    private String name;
    private String ruler;
    private int population;
    private String region;

    // No-argument constructor
    public Kingdom() {
        System.out.println("no argument constructor of Kingdom");
    }

    // Parameterized constructor
    public Kingdom(String name, String ruler, int population, String region) {
        this.name = name;
        this.ruler = ruler;
        this.population = population;
        this.region = region;
    }

    @Override
    public String toString() {
        return "Kingdom{name='" + name + "', ruler='" + ruler + "', population=" + population + ", region='" + region + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Kingdom) {
            Kingdom other = (Kingdom) obj;
            if (Objects.equals(this.name, other.name)
                    && Objects.equals(this.ruler, other.ruler)
                    && this.population == other.population
                    && Objects.equals(this.region, other.region)) {
                System.out.println("Kingdom is matching..");
                return true;
            }
        }
        return false;
    }
}
