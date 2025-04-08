package com.access.specifier.external;

import com.access.specifier.internal.Mint;

public class CoinRunner {
    public static void main(String[] args) {
        Mint mint = new Mint();
        mint.createCoin();

        Bank bank = new Bank();
        bank.depositCoin();
    }
}
