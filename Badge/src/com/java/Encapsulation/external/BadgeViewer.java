package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Badge;

public class BadgeViewer {
    public void viewBadge() {
        Badge badge = new Badge();

        System.out.println("Badge ID: " + badge.getBadgeId());
        System.out.println("Holder Name: " + badge.getHolderName());
        System.out.println("Access Level: " + badge.getAccessLevel());
        System.out.println("Active: " + badge.getIsActive());
        System.out.println("Department: " + badge.getDepartment());
    }
}
