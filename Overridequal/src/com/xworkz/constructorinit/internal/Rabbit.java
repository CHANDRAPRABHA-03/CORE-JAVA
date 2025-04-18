package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Rabbit {

    private String color;
    private String size;
    private int age;
    private String breed;

    // No-argument constructor
    public Rabbit() {
        System.out.println("no argument constructor of Rabbit");
    }

    // Parameterized constructor
    public Rabbit(String color, String size, int age, String breed) {
        this.color = color;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Rabbit{color='" + color + "', size='" + size + "', age=" + age + ", breed='" + breed + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Rabbit) {
            Rabbit other = (Rabbit) obj;
            if (Objects.equals(this.color, other.color)
                    && Objects.equals(this.size, other.size)
                    && this.age == other.age
                    && Objects.equals(this.breed, other.breed)) {
                System.out.println("Rabbit is matching..");
                return true;
            }
        }
        return false;
    }
}
