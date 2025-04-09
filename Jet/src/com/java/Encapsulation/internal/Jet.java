package com.java.Encapsulation.internal;

public class Jet {
    private String model = "Falcon ";
    private String manufacturer = "SkyTech Aerospace";
    private double maxSpeed = 2400.5; // in km/h
    private int seatingCapacity = 2;
    private boolean isMilitary = true;

    public Jet() {
        System.out.println("Jet object created!");
    }

    void setModel(String model) {
        this.model = model;
    }

    void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    void setIsMilitary(boolean isMilitary) {
        this.isMilitary = isMilitary;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public boolean getIsMilitary() {
        return isMilitary;
    }
}
