package com.access.specifier.internal;

public class Mint {

    public Mint() {
        System.out.println("Running Mint constructor");
    }

    public void createCoin() {
        System.out.println("Accessing public and package-private methods from internal package:");
        Coin coin = new Coin();
        coin.flip();
        coin.inspectEdges();
    }
}

