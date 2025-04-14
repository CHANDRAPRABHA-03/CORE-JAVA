package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bird;

public class BirdWatcher {

    public BirdWatcher() {
        System.out.println("BirdWatcher: No-arg constructor");
    }

    public void observe(Bird bird) {
        if (bird != null) {
            bird.sound();

            if (bird instanceof Parrot) {
                Parrot parrot = (Parrot) bird;
                parrot.flyColorfully(bird);
            } else {
                System.err.println("This bird is not a Parrot");
            }
        } else {
            System.err.println("Bird is null");
        }
    }
}
