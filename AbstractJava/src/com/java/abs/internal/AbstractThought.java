package com.java.abs.internal;

abstract class AbstractThought {
    abstract void reflect();

    void think() {
        System.out.println("Thinking deeply...");
    }
}

class PositiveThought extends AbstractThought {
    @Override
    void reflect() {
        System.out.println("Reflecting on the bright side.");
    }
}

