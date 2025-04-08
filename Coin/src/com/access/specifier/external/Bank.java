package com.access.specifier.external;

import com.access.specifier.internal.Coin;

public class Bank {

    public Bank() {
        System.out.println("Running Bank constructor");
    }

    public void depositCoin() {
        System.out.println("Accessing public method of Coin from external package:");
        Coin coin = new Coin();
        coin.flip();
    }
}
