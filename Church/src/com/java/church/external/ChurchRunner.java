package com.java.church.external;

import com.java.church.internal.Prayer;

public class ChurchRunner {
    public static void main(String[] args) {
        Prayer prayer = new Prayer();
        prayer.Display();
        Candle candle = new Candle();
        candle.matchBox();
    }
}
