package com.xworkz.Override.external;

import com.xworkz.Override.internal.Brush;

public class Artistsss {

    public Artistsss() {
        System.out.println("Artist: No-arg constructor");
    }

    public void paint(Brush brush) {
        if (brush != null) {
            brush.use();

            if (brush instanceof Painter) {
                Painter painter = (Painter) brush;
                painter.dipInPaint(brush);
            } else {
                System.err.println("This brush is not a Painter");
            }
        } else {
            System.err.println("Brush is null");
        }
    }
}
