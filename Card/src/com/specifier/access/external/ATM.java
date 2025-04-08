package com.specifier.access.external;

import com.specifier.access.internal.Card;

public class ATM {

    public ATM() {
        System.out.println("Running ATM constructor");
    }

    public void externalCardAccess() {
        System.out.println("Accessing public method of Card from external package:");
        Card card = new Card();
        card.swipe();

    }
}
