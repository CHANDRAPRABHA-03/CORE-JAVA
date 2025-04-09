package com.java.Encapsulation;

import com.java.Encapsulation.internal.User;
import com.java.Encapsulation.external.Viewer;

public class Runner {
    public static void main(String[] args) {
        User user = new User();
        user.displayMutant();

        System.out.println();

        Viewer viewer = new Viewer();
        viewer.viewMutant();
    }
}
