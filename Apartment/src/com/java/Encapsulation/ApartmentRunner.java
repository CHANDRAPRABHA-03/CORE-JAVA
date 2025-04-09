package com.java.Encapsulation;

import com.java.Encapsulation.external.ApartmentViewer;
import com.java.Encapsulation.internal.ApartmentUser;

public class ApartmentRunner{
    public static void main(String[] args) {
        ApartmentUser apartmentDetails = new ApartmentUser();
        apartmentDetails.displayApartment();

        System.out.println();

        ApartmentViewer apartmentViewer = new ApartmentViewer();
        apartmentViewer.viewApartment();
    }
}
