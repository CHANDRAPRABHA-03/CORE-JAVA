package com.xworkz.Override.external;

import com.xworkz.Override.internal.Canvas;

public class Gallery {

    public Gallery() {
        System.out.println("Gallery: No-arg constructor");
    }

    public void exhibitCanvas(Canvas canvas) {
        if (canvas != null) {
            canvas.display();

            if (canvas instanceof Artist) {
                Artist artist = (Artist) canvas;
                artist.paint(canvas);
            } else {
                System.out.println("This is just a Canvas, not a painted masterpiece");
            }
        } else {
            System.out.println("No canvas to exhibit.");
        }
    }
}
