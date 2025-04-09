package com.java.inheritance.runner;

import com.java.inheritance.external.Led;
import com.java.inheritance.internal.Light;

public class Runner {
    public static void main(String[] args) {
        Light light = new Light();
        System.out.println();
        Light light1 = new Led();
    }
}
