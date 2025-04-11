package com.xworkz.Override.external;

import com.xworkz.Override.internal.Seed;

public class Tree extends Seed {

    public Tree() {
        System.out.println("Tree: No-arg constructor");
    }

    @Override
    public void grow() {
        System.out.println("Tree grows tall from a tiny seed");
    }

    public void provide(Seed seed) {
        if (seed != null) {
            System.out.println("Tree provides shade, fruit, and air — all from that seed");
        } else {
            System.out.println("No seed, no tree — no life to provide");
        }
    }
}
