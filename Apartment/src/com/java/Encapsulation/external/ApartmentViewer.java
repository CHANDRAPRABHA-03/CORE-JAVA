package com.java.Encapsulation.external;


import com.java.Encapsulation.internal.Apartment;

public class ApartmentViewer {
    public void viewApartment() {
        Apartment apartment = new Apartment();

        System.out.println("Apartment Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Number of Units: " + apartment.getNumberOfUnits());
        System.out.println("Pet Friendly: " + apartment.getIsPetFriendly());
        System.out.println("Staff Count: " + apartment.getStaffCount());
    }
}
