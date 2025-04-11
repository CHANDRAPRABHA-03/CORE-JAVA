package com.xworkz.Override.external;

import com.xworkz.Override.internal.Paper;

public class Notebook extends Paper {

    public Notebook() {
        System.out.println("Notebook: No-arg constructor");
    }

    @Override
    public void writeOn() {
        System.out.println("Writing on a ruled notebook page.");
    }

    public void tear(Paper paper) {
        if (paper != null) {
            System.out.println("Tearing a page from the notebook.");
        } else {
            System.out.println("Nothing to tear.");
        }
    }
}
