package com.xworkz.Override.external;

import com.xworkz.Override.internal.CurlyHair;

public class StyledCurlyHair extends CurlyHair {

    public StyledCurlyHair() {
        System.out.println("StyledCurlyHair: No-arg constructor");
    }

    @Override
    public void look() {
        System.out.println("StyledCurlyHair: Defined curls with styling products");
    }

    public void shine(CurlyHair hair) {
        if (hair != null) {
            System.out.println("StyledCurlyHair: Shiny and bouncy with leave-in conditioner");
        } else {
            System.out.println("StyledCurlyHair: No hair to shine");
        }
    }
}
