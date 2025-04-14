package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bird;

public class Zookeeper
{

    public Zookeeper() {
        System.out.println("Zookeeper: No-arg constructor");
    }

    public void listenToBirdSound(Bird bird) {
        if (bird != null) {
            bird.sound();

            if (bird instanceof Parrot) {
                Parrot parrot = (Parrot) bird;
                parrot.flyColorfully(bird);
            } else {
                System.out.println("This is not a Parrot. It's just a regular bird.");
            }
        } else {
            System.out.println("No bird to listen to.");
        }
    }
}
