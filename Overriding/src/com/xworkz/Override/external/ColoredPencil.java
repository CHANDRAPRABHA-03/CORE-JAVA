package com.xworkz.Override.external;

import com.xworkz.Override.internal.Pencil;

public class ColoredPencil extends Pencil {

    public ColoredPencil() {
        System.out.println("ColoredPencil: No-arg constructor");
    }

    @Override
    public void usage() {
        System.out.println("ColoredPencil: Used for drawing colorful artwork.");
    }

    public void sharpen(Pencil pencil) {
        if (pencil != null) {
            System.out.println("ColoredPencil: Sharpening the pencil to make it pointy.");
        } else {
            System.out.println("No pencil to sharpen.");
        }
    }
}
