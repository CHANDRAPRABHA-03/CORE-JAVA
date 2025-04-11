package com.xworkz.Override.external;

import com.xworkz.Override.internal.Ticket;

public class Passenger extends Ticket {

    public Passenger() {
        System.out.println("Passenger: No-arg constructor");
    }

    @Override
    public void validate() {
        System.out.println("Passenger is presenting the ticket for validation");
    }

    public void board(Ticket ticket) {
        if (ticket != null) {
            System.out.println("Passenger is boarding the transport with the ticket");
        } else {
            System.out.println("No ticket to board");
        }
    }
}
