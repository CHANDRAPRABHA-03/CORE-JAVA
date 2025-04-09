package com.java.Encapsulation.internal;

public class GymUser {
    public void test() {
        Gym gym = new Gym();
        gym.setGymCode("GYM-Z1");
        gym.setGymName("Muscle Factory");
        gym.setMemberCount(120);
        gym.setOpen24Hours(true);
        gym.setMonthlyFee(999.99);

        System.out.println("Gym Name: " + gym.getGymName());
        System.out.println("24/7 Open: " + gym.isOpen24Hours());
        System.out.println("Monthly Fee: ₹" + gym.getMonthlyFee());

        gym.showStatus();
    }
}
