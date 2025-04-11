package com.xworkz.Override.external;

import com.xworkz.Override.internal.Order;

public class Chef extends Order {

    public Chef() {
        System.out.println("Chef: No-arg constructor");
    }

    @Override
    public void prepare() {
        System.out.println("Chef is skillfully cooking the order with finesse");
    }

    public void cook(Order order) {
        if (order != null) {
            System.out.println("Chef is cooking the received order");
        } else {
            System.out.println("No order to cook");
        }
    }
}
