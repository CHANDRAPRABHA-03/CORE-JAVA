package com.xworkz.Override.external;

import com.xworkz.Override.internal.Champakali;

public class DryFruitChampakali extends Champakali {

    public DryFruitChampakali() {
        System.out.println("DryFruitChampakali: No-arg constructor");
    }

    @Override
    public void taste() {
        System.out.println("DryFruitChampakali: Rich with dry fruits and extra flavor.");
    }

    public void serve(Champakali champakali) {
        if (champakali != null) {
            System.out.println("DryFruitChampakali: Served with chopped nuts and syrup.");
        } else {
            System.out.println("Nothing to serve.");
        }
    }
}
