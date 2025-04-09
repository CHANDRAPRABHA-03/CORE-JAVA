package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.Gym;

public class GymViewer {
    public void viewGym() {
        Gym gym = new Gym();

        System.out.println("Gym Name: " + gym.getName());
        System.out.println("Location: " + gym.getLocation());
        System.out.println("Total Members: " + gym.getTotalMembers());
        System.out.println("Has Personal Trainers: " + gym.getHasPersonalTrainers());
        System.out.println("Monthly Fee: " + gym.getMonthlyFee());
    }
}
