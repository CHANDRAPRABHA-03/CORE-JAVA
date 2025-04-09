package com.java.inheritance.runner;

import com.java.inheritance.external.Sofa;
import com.java.inheritance.internal.Furniture;
import com.java.inheritance.internal.Product;

public class Runner {
    public static void main(String[] args) {
        Product product = new Product();
        System.out.println();
        Product product1 = new Furniture();
        System.out.println();
        Product product2 = new Sofa();
    }
}
