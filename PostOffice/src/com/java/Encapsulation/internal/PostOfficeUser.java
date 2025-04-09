package com.java.Encapsulation.internal;

public class PostOfficeUser {
    public void displayPostOffice() {
        PostOffice office = new PostOffice();

        System.out.println("Name: " + office.getName());
        System.out.println("Location: " + office.getLocation());
        System.out.println("Employees: " + office.getNumberOfEmployees());
        System.out.println("Government Owned: " + office.getIsGovernmentOwned());
        System.out.println("Boxes Available: " + office.getNumberOfBoxes());

        // Update post office info
        office.setName("Westside Post Office");
        office.setLocation("Hillview Road");
        office.setNumberOfEmployees(15);
        office.setIsGovernmentOwned(false);
        office.setNumberOfBoxes(120);

        System.out.println("Updated Post Office Name: " + office.getName());
    }
}
