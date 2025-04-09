package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.PostOffice;

public class PostOfficeViewer {
    public void viewPostOffice() {
        PostOffice office = new PostOffice();

        System.out.println("Name: " + office.getName());
        System.out.println("Location: " + office.getLocation());
        System.out.println("Employees: " + office.getNumberOfEmployees());
        System.out.println("Government Owned: " + office.getIsGovernmentOwned());
        System.out.println("Boxes Available: " + office.getNumberOfBoxes());
    }
}
