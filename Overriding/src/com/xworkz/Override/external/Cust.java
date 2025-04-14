package com.xworkz.Override.external;

import com.xworkz.Override.internal.Champakali;

public class Cust{

    public Cust() {
        System.out.println("Customer: No-arg constructor");
    }

    public void enjoyDessert(Champakali champakali) {
        if (champakali != null) {
            champakali.taste();

            if (champakali instanceof DryFruitChampakali) {
                DryFruitChampakali dryFruitChampakali = (DryFruitChampakali) champakali;
                dryFruitChampakali.serve(champakali);
            } else {
                System.out.println("This is a basic Champakali, no extra ingredients.");
            }
        } else {
            System.out.println("No dessert to enjoy.");
        }
    }
}
