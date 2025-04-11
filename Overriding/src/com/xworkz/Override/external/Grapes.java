package com.xworkz.Override.external;

import com.xworkz.Override.internal.GreenGrapes;

public class Grapes extends GreenGrapes {

    public Grapes() {
        System.out.println("Grapes: No-arg constructor");
    }

    @Override
    public void taste() {
        System.out.println("Grapes taste sweet and are rich in flavor.");
    }

    public void makeWine(GreenGrapes greenGrapes) {
        if (greenGrapes != null) {
            System.out.println("Making wine from green grapes...");
        } else {
            System.out.println("No grapes available for wine.");
        }
    }
}
