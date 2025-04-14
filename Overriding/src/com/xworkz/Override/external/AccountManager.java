package com.xworkz.Override.external;

import com.xworkz.Override.internal.BankAccount;

public class AccountManager {

    public AccountManager() {
        System.out.println("AccountManager constructor called");
    }

    public void processAccount(BankAccount account) {
        if (account != null) {
            account.withdraw();

            if (account instanceof SavingsAccount) {
                SavingsAccount savings = (SavingsAccount) account;
                savings.calculateInterest(account);
            } else {
                System.err.println("This account is not a SavingsAccount");
            }
        } else {
            System.err.println("Account is null");
        }
    }
}
