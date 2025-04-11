package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bedsheet;

public class SilkBedsheet extends Bedsheet {

    public SilkBedsheet() {
        System.out.println("SilkBedsheet: No-arg constructor");
    }

    @Override
    public void spread() {
        System.out.println("Spreading a shiny silk bedsheet");
    }

    public void shine(Bedsheet bedsheet) {
        if (bedsheet != null) {
            System.out.println("The silk bedsheet is shining beautifully");
        } else {
            System.out.println("No bedsheet to shine");
        }
    }
}
