package com.xworkz.Override.external;

import com.xworkz.Override.internal.Scene;

public class Projector extends Scene {

    public Projector() {
        System.out.println("Projector: No-arg constructor");
    }

    @Override
    public void display() {
        System.out.println("Projector displays the scene on a big screen");
    }

    public void project(Scene scene) {
        if (scene != null) {
            System.out.println("Projector is projecting a beautiful scene");
        } else {
            System.out.println("No scene to project — screen is blank");
        }
    }
}
