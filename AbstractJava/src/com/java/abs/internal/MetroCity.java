package com.java.abs.internal;

abstract class AbstractMetro {
    void greet() {
        System.out.println("Welcome to the Metro!");
    }
}

class MetroLine extends AbstractMetro {
    void showLine() {
        System.out.println("This is the Blue Line.");
    }
}

