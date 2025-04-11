package com.xworkz.Override.external;

import com.xworkz.Override.internal.Grill;

public class Cook extends Grill {

    public Cook() {
        System.out.println("Cook: No-arg constructor");
    }

    @Override
    public void heatUp() {
        System.out.println("Cook is adjusting the grill heat for perfect searing");
    }

    public void grillFood(Grill grill) {
        if (grill != null) {
            System.out.println("Cook is grilling steaks and veggies on the grill");
        } else {
            System.out.println("No grill available for cooking");
        }
    }
}
