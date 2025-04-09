package com.java.Encapsulation.internal;

public class Gym {
    private String name = "FlexZone Gym";
    private String location = "Central Street";
    private int totalMembers = 120;
    private boolean hasPersonalTrainers = true;
    private double monthlyFee = 999.99;

    public Gym() {
        System.out.println("Gym object created!");
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setTotalMembers(int totalMembers) {
        this.totalMembers = totalMembers;
    }

    void setHasPersonalTrainers(boolean hasPersonalTrainers) {
        this.hasPersonalTrainers = hasPersonalTrainers;
    }

    void setMonthlyFee(double monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public int getTotalMembers() {
        return totalMembers;
    }

    public boolean getHasPersonalTrainers() {
        return hasPersonalTrainers;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }
}
