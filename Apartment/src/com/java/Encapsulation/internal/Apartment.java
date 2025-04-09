package com.java.Encapsulation.internal;

public class Apartment {
    private String name = "Sunrise Apartments";
    private String location = "Hilltop Road";
    private int numberOfUnits = 100;
    private boolean isPetFriendly = true;
    private int staffCount = 20;

    public Apartment() {
        System.out.println("Apartment object created!");
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    void setIsPetFriendly(boolean isPetFriendly) {
        this.isPetFriendly = isPetFriendly;
    }

    void setStaffCount(int staffCount) {
        this.staffCount = staffCount;
    }


    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public boolean getIsPetFriendly() {
        return isPetFriendly;
    }

    public int getStaffCount() {
        return staffCount;
    }
}
