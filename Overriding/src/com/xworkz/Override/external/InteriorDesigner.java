package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bedsheet;

public class InteriorDesigner {

    public InteriorDesigner() {
        System.out.println("InteriorDesigner: No-arg constructor");
    }

    public void decorate(Bedsheet bedsheet) {
        if (bedsheet != null) {
            bedsheet.spread();

            if (bedsheet instanceof SilkBedsheet) {
                SilkBedsheet silk = (SilkBedsheet) bedsheet;
                silk.shine(bedsheet);
            } else {
                System.err.println("This bedsheet is not a SilkBedsheet");
            }
        } else {
            System.err.println("Bedsheet is null");
        }
    }
}
