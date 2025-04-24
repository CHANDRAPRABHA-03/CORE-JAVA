package com.java.abs.internal;

public abstract class AbstractApartment {
    abstract void openDoor();
    abstract void closeDoor();

    void turnOnLights() {
        System.out.println("Lights turned ON");
    }

    void turnOffLights() {
        System.out.println("Lights turned OFF");
    }
}

public class SemiFurnishedApartment extends AbstractApartment {
    @Override
    void openDoor() {
        System.out.println("Door opened manually");
    }
    // closeDoor() not implemented here
}

class FullyFurnishedApartment extends SemiFurnishedApartment {
    @Override
    void closeDoor() {
        System.out.println("Door closed automatically");
    }
}

