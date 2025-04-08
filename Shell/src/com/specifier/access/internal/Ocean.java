package com.specifier.access.internal;

public class Ocean {

    public Ocean() {
        System.out.println("Running Ocean constructor");
    }

    public void exploreShell() {
        System.out.println("Accessing public and package-private methods from internal package:");
        Shell shell = new Shell();
        shell.displayColor();
        shell.textureDetails();
    }
}
