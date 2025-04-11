package com.xworkz.Override.external;

import com.xworkz.Override.internal.Library;

public class Librarian extends Library {

    public Librarian() {
        System.out.println("Librarian: No-arg constructor");
    }

    @Override
    public void organize() {
        System.out.println("Librarian is organizing the books in the library");
    }

    public void manage(Library library) {
        if (library != null) {
            System.out.println("Librarian is managing the library's collection of books");
        } else {
            System.out.println("No library to manage");
        }
    }
}
