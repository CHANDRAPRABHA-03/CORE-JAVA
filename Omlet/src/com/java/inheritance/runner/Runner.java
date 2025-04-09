package com.java.inheritance.runner;

import com.java.inheritance.external.Omlet;
import com.java.inheritance.internal.Dish;
import com.java.inheritance.internal.SideDish;

public class Runner {
    public static void main(String[] args) {
        Dish dish = new Dish();
        System.out.println();
        Dish dish1 = new SideDish();
        System.out.println();
        Dish dish2 = new Omlet();
    }
}
