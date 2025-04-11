package com.xworkz.Override.external;

import com.xworkz.Override.internal.Noodle;

public class WokChef extends Noodle {

    public WokChef() {
        System.out.println("WokChef: No-arg constructor");
    }

    @Override
    public void cook() {
        System.out.println("WokChef is stir-frying noodles with sauces and veggies");
    }

    public void toss(Noodle noodle) {
        if (noodle != null) {
            System.out.println("WokChef is tossing the noodles in the wok like a pro!");
        } else {
            System.out.println("No noodle to toss in the wok");
        }
    }
}
