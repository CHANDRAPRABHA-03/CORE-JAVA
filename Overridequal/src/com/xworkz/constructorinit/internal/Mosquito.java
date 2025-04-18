package com.xworkz.constructorinit.internal;

import java.util.Objects;

public class Mosquito {

    private String species;
    private double wingspan;
    private boolean isMalariaCarrier;
    private String habitat;

    // No-argument constructor
    public Mosquito() {
        System.out.println("no argument constructor of Mosquito");
    }

    // Parameterized constructor
    public Mosquito(String species, double wingspan, boolean isMalariaCarrier, String habitat) {
        this.species = species;
        this.wingspan = wingspan;
        this.isMalariaCarrier = isMalariaCarrier;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mosquito{species='" + species + "', wingspan=" + wingspan + "cm, isMalariaCarrier=" + isMalariaCarrier + ", habitat='" + habitat + "'}";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Mosquito) {
            Mosquito other = (Mosquito) obj;
            if (Objects.equals(this.species, other.species)
                    && this.wingspan == other.wingspan
                    && this.isMalariaCarrier == other.isMalariaCarrier
                    && Objects.equals(this.habitat, other.habitat)) {
                System.out.println("Mosquito is matching..");
                return true;
            }
        }
        return false;
    }
}
