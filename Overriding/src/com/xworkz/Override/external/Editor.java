package com.xworkz.Override.external;

import com.xworkz.Override.internal.Story;

public class Editor extends Story {

    public Editor() {
        System.out.println("Editor: No-arg constructor");
    }

    @Override
    public void write() {
        System.out.println("Editor refines and formats the story for publishing");
    }

    public void review(Story story) {
        if (story != null) {
            System.out.println("Editor is reviewing the story for improvements");
        } else {
            System.out.println("No story to review");
        }
    }
}
