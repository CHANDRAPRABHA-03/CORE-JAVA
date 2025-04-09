package com.java.Encapsulation.internal;

public class Garage {
    private String name = "City Garage";
    private int capacity = 30;
    private boolean hasCarWash = true;
    private String location = "Downtown";
    private int numberOfStaff = 8;

    public Garage() {
        System.out.println("Garage object created!");
    }

    void setName(String name) {
        this.name = name;
    }

    void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    void setHasCarWash(boolean hasCarWash) {
        this.hasCarWash = hasCarWash;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfStaff(int numberOfStaff) {
        this.numberOfStaff = numberOfStaff;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean getHasCarWash() {
        return hasCarWash;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfStaff() {
        return numberOfStaff;
    }
}
