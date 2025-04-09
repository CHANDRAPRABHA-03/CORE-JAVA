package com.java.Encapsulation.internal;

public class BadgeUser {
    public void displayBadge() {
        Badge badge = new Badge();

        System.out.println("Badge ID: " + badge.getBadgeId());
        System.out.println("Holder Name: " + badge.getHolderName());
        System.out.println("Access Level: " + badge.getAccessLevel());
        System.out.println("Active: " + badge.getIsActive());
        System.out.println("Department: " + badge.getDepartment());

        // Update badge details
        badge.setBadgeId("B007");
        badge.setHolderName("Prabha");
        badge.setAccessLevel("User");
        badge.setIsActive(false);
        badge.setDepartment("HR");

        System.out.println("Updated Holder Name: " + badge.getHolderName());
    }
}
