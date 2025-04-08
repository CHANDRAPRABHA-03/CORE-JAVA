package com.specifier.access.internal;

public class Shell {

    public Shell() {
        System.out.println("In no-arg Shell constructor running");
    }

    public void displayColor() {
        System.out.println("Running public displayColor method");
    }

    void textureDetails() {
        System.out.println("Running package-default textureDetails method");
    }

    private void pearlInside() {
        System.out.println("Running private pearlInside method");
    }
}
