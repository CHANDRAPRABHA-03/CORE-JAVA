package com.java.abs.internal;

abstract class AbstractDream {
    String dream;

    AbstractDream(String dream) {
        this.dream = dream;
    }

    void describeDream() {
        System.out.println("Dream: " + dream);
    }
}

class NightDream extends AbstractDream {
    NightDream(String dream) {
        super(dream);
    }
}
