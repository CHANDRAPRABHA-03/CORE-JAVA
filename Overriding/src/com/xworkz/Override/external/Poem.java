package com.xworkz.Override.external;

import com.xworkz.Override.internal.Ink;

public class Poem extends Ink {

    public Poem() {
        System.out.println("Poem: No-arg constructor");
    }

    @Override
    public void flow() {
        System.out.println("Poem flows with emotion, guided by ink");
    }

    public void inspire(Ink ink) {
        if (ink != null) {
            System.out.println("Poem inspires hearts, one ink drop at a time");
        } else {
            System.out.println("No ink, no words to inspire");
        }
    }
}
