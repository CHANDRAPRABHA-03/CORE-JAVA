package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Occupation;

public class OccupationViewer {
    public void viewOccupation() {
        Occupation occupation = new Occupation();

        System.out.println("Title: " + occupation.getTitle());
        System.out.println("Industry: " + occupation.getIndustry());
        System.out.println("Salary: " + occupation.getSalary());
        System.out.println("Remote: " + occupation.getIsRemote());
        System.out.println("Years of Experience: " + occupation.getYearsOfExperience());
    }
}
