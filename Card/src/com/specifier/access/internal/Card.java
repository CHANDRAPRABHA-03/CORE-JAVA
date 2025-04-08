package com.specifier.access.internal;

public class Card {

    public Card() {
        System.out.println("In no-arg Card constructor running");
    }

    public void swipe() {
        System.out.println("Running public swipe method");
    }

    void checkBalance() {
        System.out.println("Running package-default checkBalance method");
    }

    private void pinNumber() {
        System.out.println("Running private pinNumber method");
    }
}
