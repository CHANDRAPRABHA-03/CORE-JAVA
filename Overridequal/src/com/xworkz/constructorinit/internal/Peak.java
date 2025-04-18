package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Peak {

    private String name;
    private double height;
    private String mountainRange;
    private String country;

    // No-argument constructor
    public Peak() {
        System.out.println("no argument constructor of Peak");
    }

    // Parameterized constructor
    public Peak(String name, double height, String mountainRange, String country) {
        this.name = name;
        this.height = height;
        this.mountainRange = mountainRange;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Peak{name='" + name + "', height=" + height + "m, mountainRange='" + mountainRange + "', country='" + country + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Peak) {
            Peak other = (Peak) obj;
            if (Objects.equals(this.name, other.name)
                    && this.height == other.height
                    && Objects.equals(this.mountainRange, other.mountainRange)
                    && Objects.equals(this.country, other.country)) {
                System.out.println("Peak is matching..");
                return true;
            }
        }
        return false;
    }
}
