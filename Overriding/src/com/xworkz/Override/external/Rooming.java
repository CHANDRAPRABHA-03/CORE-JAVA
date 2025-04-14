package com.xworkz.Override.external;

import com.xworkz.Override.internal.Window;

public class Rooming {

    public Rooming() {
        System.out.println("Room: No-arg constructor");
    }

    public void manageWindow(Window window) {
        if (window != null) {
            window.open();

            if (window instanceof GlassWindow) {
                GlassWindow glassWindow = (GlassWindow) window;
                glassWindow.reflect(window);
            } else {
                System.out.println("This is a basic Window, no reflection.");
            }
        } else {
            System.out.println("No window to manage.");
        }
    }
}
