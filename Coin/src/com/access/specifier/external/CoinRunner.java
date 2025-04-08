package com.access.specifier.external;

import com.access.specifier.internal.note;

public class CoinRunner {
    public static void main(String[] args){

        note Note = new note();
        note.Display();
        GoldCoin goldCoin = new GoldCoin();
        goldCoin.brozneCoin();
    }
}
