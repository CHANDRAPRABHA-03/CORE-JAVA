package com.java.abs.internal;
abstract class AbstractWish {
    abstract void makeWish();
}

class BirthdayWish extends AbstractWish {
    @Override
    void makeWish() {
        System.out.println("I wish for happiness and success!");
    }
}
