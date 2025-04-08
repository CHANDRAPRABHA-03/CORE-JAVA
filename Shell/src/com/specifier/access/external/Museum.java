package com.specifier.access.external;

import com.specifier.access.internal.Shell;

public class Museum {

    public Museum() {
        System.out.println("Running Museum constructor");
    }

    public void viewShell() {
        System.out.println("Accessing public method of Shell from external package:");
        Shell shell = new Shell();
        shell.displayColor();

    }
}
