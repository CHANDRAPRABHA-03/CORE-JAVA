package com.xworkz.Override.external;

import com.xworkz.Override.internal.Moon;

public class FullMoon extends Moon {

    public FullMoon() {
        System.out.println("FullMoon: No-arg constructor");
    }

    @Override
    public void shine() {
        System.out.println("FullMoon: The full moon shines brightly and illuminates the night.");
    }

    public void rise(Moon moon) {
        if (moon != null) {
            System.out.println("FullMoon: The full moon rises over the horizon.");
        } else {
            System.out.println("No moon to rise.");
        }
    }
}
