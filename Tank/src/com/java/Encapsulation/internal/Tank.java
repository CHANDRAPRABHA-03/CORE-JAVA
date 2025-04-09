package com.java.Encapsulation.internal;

public class Tank {
    private String model = "T-90 Bhishma";
    private String countryOfOrigin = "India";
    private int crewSize = 3;
    private boolean isAmphibious = false;
    private double weightInTons = 46.5;

    public Tank() {
        System.out.println("Tank object created!");
    }

    void setModel(String model) {
        this.model = model;
    }

    void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    void setCrewSize(int crewSize) {
        this.crewSize = crewSize;
    }

    void setIsAmphibious(boolean isAmphibious) {
        this.isAmphibious = isAmphibious;
    }

    void setWeightInTons(double weightInTons) {
        this.weightInTons = weightInTons;
    }

    public String getModel() {
        return model;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public int getCrewSize() {
        return crewSize;
    }

    public boolean getIsAmphibious() {
        return isAmphibious;
    }

    public double getWeightInTons() {
        return weightInTons;
    }
}
