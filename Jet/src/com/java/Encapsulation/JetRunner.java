package com.java.Encapsulation;

import com.java.Encapsulation.internal.JetUser;
import com.java.Encapsulation.external.JetViewer;

public class JetRunner {
    public static void main(String[] args) {
        JetUser user = new JetUser();
        user.displayJet();

        System.out.println();

        JetViewer viewer = new JetViewer();
        viewer.viewJet();
    }
}
