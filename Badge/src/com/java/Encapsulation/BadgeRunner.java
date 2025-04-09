package com.java.Encapsulation;

import com.java.Encapsulation.internal.BadgeUser;
import com.java.Encapsulation.external.BadgeViewer;

public class BadgeRunner {
    public static void main(String[] args) {
        BadgeUser user = new BadgeUser();
        user.displayBadge();

        System.out.println();

        BadgeViewer viewer = new BadgeViewer();
        viewer.viewBadge();
    }
}
