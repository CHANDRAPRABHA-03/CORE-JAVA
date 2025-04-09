package com.java.Encapsulation.internal;

public class OccupationUser {
    public void displayOccupation() {
        Occupation occupation = new Occupation();

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Remote: " + occupation.getIsRemote());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());

        // Update details
        occupation.setTitle("Data Scientist");
        occupation.setIndustry("Finance");
        occupation.setSalary(95000.00);
        occupation.setIsRemote(false);
        occupation.setYearsOfExperience(5);

        System.out.println("Updated Title: " + occupation.getTitle());
    }
}
