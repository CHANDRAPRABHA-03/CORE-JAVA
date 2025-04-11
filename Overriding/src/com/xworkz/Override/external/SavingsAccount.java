package com.xworkz.Override.external;

import com.xworkz.Override.internal.BankAccount;

public class SavingsAccount extends BankAccount {

    public SavingsAccount() {
        System.out.println("SavingsAccount constructor called");
    }

    @Override
    public void withdraw() {
        System.out.println("Withdraw with minimum balance check in SavingsAccount");
    }

    public void calculateInterest(BankAccount account) {
        if (account != null) {
            System.out.println("Calculating interest for SavingsAccount");
        } else {
            System.out.println("Account is null");
        }
    }
}
