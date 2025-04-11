package com.xworkz.Override.external;

import com.xworkz.Override.internal.Invoice;

public class Accountant extends Invoice {

    public Accountant() {
        System.out.println("Accountant: No-arg constructor");
    }

    @Override
    public void process() {
        System.out.println("Accountant verifies and finalizes the invoice");
    }

    public void audit(Invoice invoice) {
        if (invoice != null) {
            System.out.println("Accountant is auditing the invoice for accuracy");
        } else {
            System.out.println("No invoice available to audit");
        }
    }
}
