package com.java.Encapsulation;

import com.java.Encapsulation.internal.TankUser;
import com.java.Encapsulation.external.TankViewer;

public class Runner {
    public static void main(String[] args) {
        TankUser user = new TankUser();
        user.displayTank();

        System.out.println();

        TankViewer viewer = new TankViewer();
        viewer.viewTank();
    }
}
