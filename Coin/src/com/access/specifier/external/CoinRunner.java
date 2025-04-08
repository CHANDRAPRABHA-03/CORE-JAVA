package com.access.specifier.external;

import com.specifier.access.internal.Mint;

public class Runner {
    public static void main(String[] args) {
        Mint mint = new Mint();
        mint.createCoin();

        Bank bank = new Bank();
        bank.depositCoin();
    }
}
