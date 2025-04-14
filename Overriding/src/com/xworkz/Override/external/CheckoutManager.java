package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bill;

public class CheckoutManager {

    public CheckoutManager() {
        System.out.println("CheckoutManager: No-arg constructor");
    }

    public void process(Bill bill) {
        if (bill != null) {
            bill.print();

            if (bill instanceof Cashier) {
                Cashier cashier = (Cashier) bill;
                cashier.scan(bill);
            } else {
                System.err.println("This bill is not processed by a Cashier");
            }
        } else {
            System.err.println("Bill is null");
        }
    }
}
