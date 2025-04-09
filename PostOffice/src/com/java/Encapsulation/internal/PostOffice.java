package com.java.Encapsulation.internal;

public class PostOffice {
    private String name = "Rural Post Office";
    private String location = "Benaka Street";
    private int numberOfEmployees = 25;
    private boolean isGovernmentOwned = true;
    private int numberOfBoxes = 300;

    public PostOffice() {
        System.out.println("PostOffice object created!");
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    void setIsGovernmentOwned(boolean isGovernmentOwned) {
        this.isGovernmentOwned = isGovernmentOwned;
    }

    void setNumberOfBoxes(int numberOfBoxes) {
        this.numberOfBoxes = numberOfBoxes;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public boolean getIsGovernmentOwned() {
        return isGovernmentOwned;
    }

    public int getNumberOfBoxes() {
        return numberOfBoxes;
    }
}
