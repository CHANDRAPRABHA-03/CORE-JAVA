package com.xworkz.Override.external;

import com.xworkz.Override.internal.Dessert;

public class PastryChef extends Dessert {

    public PastryChef() {
        System.out.println("PastryChef: No-arg constructor");
    }

    @Override
    public void serve() {
        System.out.println("PastryChef serves the dessert with artistic presentation");
    }

    public void decorate(Dessert dessert) {
        if (dessert != null) {
            System.out.println("PastryChef is decorating the dessert with cream and toppings");
        } else {
            System.out.println("No dessert to decorate");
        }
    }
}
