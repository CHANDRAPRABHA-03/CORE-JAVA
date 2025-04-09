package com.java.Encapsulation;

import com.java.Encapsulation.internal.GymUser;
import com.java.Encapsulation.external.GymViewer;

public class GymRunner {
    public static void main(String[] args) {
        GymUser user = new GymUser();
        user.displayGym();

        System.out.println();

        GymViewer viewer = new GymViewer();
        viewer.viewGym();
    }
}
