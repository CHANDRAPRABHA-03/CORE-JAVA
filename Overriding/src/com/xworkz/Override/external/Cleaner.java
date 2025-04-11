package com.xworkz.Override.external;

import com.xworkz.Override.internal.Room;

public class Cleaner extends Room {

    public Cleaner() {
        System.out.println("Cleaner: No-arg constructor");
    }

    @Override
    public void clean() {
        System.out.println("Cleaner is cleaning and organizing the room to perfection");
    }

    public void mop(Room room) {
        if (room != null) {
            System.out.println("Cleaner is mopping the floor of the room");
        } else {
            System.out.println("No room to mop");
        }
    }
}
