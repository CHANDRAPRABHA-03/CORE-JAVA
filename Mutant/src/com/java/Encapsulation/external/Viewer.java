package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Mutant;

public class Viewer {
    public void viewMutant() {
        Mutant mutant = new Mutant();

        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Age: " + mutant.getAge());
        System.out.println("Is X-Men Member: " + mutant.getIsXMenMember());
        System.out.println("Origin: " + mutant.getOrigin());
    }
}
