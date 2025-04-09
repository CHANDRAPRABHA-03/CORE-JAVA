package com.java.inheritance.runner;

import com.java.inheritance.external.Sneaker;
import com.java.inheritance.internal.Accessory;
import com.java.inheritance.internal.Shoe;

public class Runner {
    public static void main(String[] args) {
        Accessory accessory = new Accessory();
        System.out.println();
        Accessory accessory1 = new Shoe();
        System.out.println();
        Accessory accessory2 = new Sneaker();
    }
}
