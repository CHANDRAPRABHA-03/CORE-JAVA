package com.xworkz.Override.external;

import com.xworkz.Override.internal.Oil;

public class CoconutOil extends Oil {

    public CoconutOil() {
        System.out.println("CoconutOil: No-arg constructor");
    }

    @Override
    public void use() {
        System.out.println("CoconutOil: Used for hair care and skincare");
    }

    public void benefits(Oil oil) {
        if (oil != null) {
            System.out.println("CoconutOil: Has anti-bacterial and moisturizing benefits");
        } else {
            System.out.println("CoconutOil: No oil object to describe benefits");
        }
    }
}
