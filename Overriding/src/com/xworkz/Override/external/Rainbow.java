package com.xworkz.Override.external;

import com.xworkz.Override.internal.Rain;

public class Rainbow extends Rain {

    public Rainbow() {
        System.out.println("Rainbow: No-arg constructor");
    }

    @Override
    public void pour() {
        System.out.println("Rainbow appears after the rain with vibrant colors");
    }

    public void shine(Rain rain) {
        if (rain != null) {
            System.out.println("Rainbow shines bright after the gentle rain");
        } else {
            System.out.println("No rain, no rainbow 🌈");
        }
    }
}
