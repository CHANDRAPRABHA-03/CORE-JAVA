package com.java.inheritance.runner;

import com.java.inheritance.external.Cactus;
import com.java.inheritance.internal.Plant;
import com.java.inheritance.internal.Thing;

public class Runner {
    public static void main(String[] args) {
        Thing thing = new Thing();
        System.out.println();
        Thing thing1 = new Plant();
        System.out.println();
        Thing thing2 = new Cactus();
    }
}
