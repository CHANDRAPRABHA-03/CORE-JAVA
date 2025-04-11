package com.xworkz.Override.external;

import com.xworkz.Override.internal.Canvas;

public class Artist extends Canvas {

    public Artist() {
        System.out.println("Artist: No-arg constructor");
    }

    @Override
    public void display() {
        System.out.println("Artist creates a beautiful masterpiece on the canvas");
    }

    public void paint(Canvas canvas) {
        if (canvas != null) {
            System.out.println("Artist is painting on the canvas with vibrant colors");
        } else {
            System.out.println("No canvas to paint on");
        }
    }
}
