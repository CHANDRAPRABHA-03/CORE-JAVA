package com.java.inheritance.runner;

import com.java.inheritance.external.Thread;
import com.java.inheritance.internal.Cotton;
import com.java.inheritance.internal.Material;

public class Runner {
    public static void main(String[] args) {
        Material material = new Material();
        System.out.println();
        Material material1 = new Cotton();
        System.out.println();
        Material material2 = new Thread();
    }
}
