package com.specifier.access.internal;

public class Wallet {

    public Wallet() {
        System.out.println("Running Wallet constructor");
    }

    public void useCard() {
        System.out.println("Accessing public and package-private methods from internal package:");
        Card card = new Card();
        card.swipe();
        card.checkBalance();
    }
}
