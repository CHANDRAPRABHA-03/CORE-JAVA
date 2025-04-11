package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bill;

public class Cashier extends Bill {

    public Cashier() {
        System.out.println("Cashier: No-arg constructor");
    }

    @Override
    public void print() {
        System.out.println("Cashier finalizes and prints the bill at checkout");
    }

    public void scan(Bill bill) {
        if (bill != null) {
            System.out.println("Cashier is scanning the bill for payment");
        } else {
            System.out.println("No bill to scan");
        }
    }
}
