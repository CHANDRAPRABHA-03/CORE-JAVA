package com.java.Encapsulation;

import com.java.Encapsulation.internal.OccupationUser;
import com.java.Encapsulation.external.OccupationViewer;

public class OccupationRunner {
    public static void main(String[] args) {
        OccupationUser user = new OccupationUser();
        user.displayOccupation();

        System.out.println();

        OccupationViewer viewer = new OccupationViewer();
        viewer.viewOccupation();
    }
}
