package com.java.Encapsulation.internal;

public class ApartmentUser {
    public void displayApartment() {
        Apartment apartment = new Apartment();

        System.out.println("Apartment Name: " + apartment.getName());
        System.out.println("Location: " + apartment.getLocation());
        System.out.println("Number of Units: " + apartment.getNumberOfUnits());
        System.out.println("Pet Friendly: " + apartment.getIsPetFriendly());
        System.out.println("Staff Count: " + apartment.getStaffCount());

        // Update the Apartment information
        apartment.setName("Oceanview Apartments");
        apartment.setLocation("Seaside Avenue");
        apartment.setNumberOfUnits(200);
        apartment.setIsPetFriendly(false);
        apartment.setStaffCount(50);

        System.out.println("Updated Apartment Name: " + apartment.getName());
    }
}


