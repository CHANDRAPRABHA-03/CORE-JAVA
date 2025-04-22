package com.java.intrface.internal;

public class OneMethod implements Airport,Carrom,Chess,Church,College{
    @Override
    public void Passport() {
        System.out.println("Passport is in OneMethod");
    }

    @Override
    public void RedPan() {
        System.out.println("RedPan is in OneMethod");
    }

    @Override
    public void startClock() {
        System.out.println("startClock is in OneMethod");
    }

    @Override
    public void Candle() {
        System.out.println("Candle is in OneMethod");
    }

    @Override
    public void Idcard() {
        System.out.println("Idcard is in OneMethod");
    }
}
