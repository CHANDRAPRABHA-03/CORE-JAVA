package com.java.Encapsulation.internal;

public class User {
    public void displayMutant() {
        Mutant mutant = new Mutant();

        System.out.println("Mutant Name: " + mutant.getName());
        System.out.println("Power: " + mutant.getPower());
        System.out.println("Age: " + mutant.getAge());
        System.out.println("Is X-Men Member: " + mutant.getIsXMenMember());
        System.out.println("Origin: " + mutant.getOrigin());

        // Modify details
        mutant.setName("Jean Grey");
        mutant.setPower("Telekinesis");
        mutant.setAge(30);
        mutant.setIsXMenMember(true);
        mutant.setOrigin("New York");

        System.out.println("Updated Mutant Name: " + mutant.getName());
    }
}
