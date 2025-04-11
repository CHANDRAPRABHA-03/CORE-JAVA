package com.xworkz.Override.external;

import com.xworkz.Override.internal.Window;

public class GlassWindow extends Window {

    public GlassWindow() {
        System.out.println("GlassWindow: No-arg constructor");
    }

    @Override
    public void open() {
        System.out.println("GlassWindow slides smoothly to open.");
    }

    public void reflect(Window window) {
        if (window != null) {
            System.out.println("GlassWindow reflects sunlight beautifully.");
        } else {
            System.out.println("Cannot reflect with a null window.");
        }
    }
}
