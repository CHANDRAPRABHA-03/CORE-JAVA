package com.xworkz.Override.external;

import com.xworkz.Override.internal.TVShow;

public class Serial extends TVShow {

    public Serial() {
        System.out.println("Serial: No-arg constructor");
    }

    @Override
    public void broadcast() {
        System.out.println("Broadcasting a dramatic family serial...");
    }

    public void cliffhanger(TVShow show) {
        if (show != null) {
            System.out.println("Ending with a cliffhanger!");
        } else {
            System.out.println("No show to end dramatically.");
        }
    }
}
