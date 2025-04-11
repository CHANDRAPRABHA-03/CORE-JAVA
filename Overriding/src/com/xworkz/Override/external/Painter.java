package com.xworkz.Override.external;

import com.xworkz.Override.internal.Brush;

public class Painter extends Brush {

    public Painter() {
        System.out.println("Painter: No-arg constructor");
    }

    @Override
    public void use() {
        System.out.println("Painter uses the brush to create strokes of color on the canvas");
    }

    public void dipInPaint(Brush brush) {
        if (brush != null) {
            System.out.println("Painter dips the brush in paint to start working");
        } else {
            System.out.println("No brush to dip in paint");
        }
    }
}
