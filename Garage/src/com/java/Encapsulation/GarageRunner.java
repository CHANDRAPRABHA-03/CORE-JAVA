package com.java.Encapsulation;

import com.java.Encapsulation.internal.GarageUser;
import com.java.Encapsulation.external.GarageViewer;

public class GarageRunner {
    public static void main(String[] args) {
        GarageUser user = new GarageUser();
        user.displayGarage();

        System.out.println();

        GarageViewer viewer = new GarageViewer();
        viewer.viewGarage();
    }
}
