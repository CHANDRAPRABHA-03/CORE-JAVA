package com.java.Encapsulation.internal;

public class Occupation {
    private String title = "Software Engineer";
    private String industry = "Technology";
    private double salary = 75000.00;
    private boolean isRemote = true;
    private int yearsOfExperience = 3;

    public Occupation() {
        System.out.println("Occupation object created!");
    }

    void setTitle(String title) {
        this.title = title;
    }

    void setIndustry(String industry) {
        this.industry = industry;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    void setIsRemote(boolean isRemote) {
        this.isRemote = isRemote;
    }

    void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String getTitle() {
        return title;
    }

    public String getIndustry() {
        return industry;
    }

    public double getSalary() {
        return salary;
    }

    public boolean getIsRemote() {
        return isRemote;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
