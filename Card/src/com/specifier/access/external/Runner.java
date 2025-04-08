package com.specifier.access.external;

import com.specifier.access.internal.Wallet;

public class Runner {
    public static void main(String[] args) {
        Wallet wallet = new Wallet();
        wallet.useCard();

        ATM atm = new ATM();
        atm.externalCardAccess();
    }
}
