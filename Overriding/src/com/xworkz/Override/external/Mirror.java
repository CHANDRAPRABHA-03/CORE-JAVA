package com.xworkz.Override.external;

import com.xworkz.Override.internal.ObjectItem;

public class Mirror extends ObjectItem {

    public Mirror() {
        System.out.println("Mirror: No-arg constructor");
    }

    @Override
    public void reflect() {
        System.out.println("Mirror shows a clear reflection.");
    }

    public void clean(ObjectItem objectItem) {
        if (objectItem != null) {
            System.out.println("Cleaning the mirror for better reflection.");
        } else {
            System.out.println("No object to clean.");
        }
    }
}
