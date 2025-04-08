package com.access.specifier.external;

import com.access.specifier.internal.Coin;

public class GoldCoin {
    public GoldCoin() {
        System.out.println(" Running external GoldCoin construct");
    }

    public void brozneCoin() {
        System.out.println("Running External BronzeCoin method and calling public method from coin");
        Coin coin = new Coin();
        coin.toss();
    }
}
