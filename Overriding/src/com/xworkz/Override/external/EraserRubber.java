package com.xworkz.Override.external;

import com.xworkz.Override.internal.Rubber;

public class EraserRubber extends Rubber {

    public EraserRubber() {
        System.out.println("EraserRubber: No-arg constructor");
    }

    @Override
    public void use() {
        System.out.println("EraserRubber: Erasing pencil marks more effectively with a soft texture.");
    }

    public void clean(Rubber rubber) {
        if (rubber != null) {
            System.out.println("EraserRubber: Cleaning the eraser to avoid dirt.");
        } else {
            System.out.println("No eraser to clean.");
        }
    }
}
