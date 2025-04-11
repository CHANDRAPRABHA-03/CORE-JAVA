package com.xworkz.Override.external;

import com.xworkz.Override.internal.Book;

public class EBook extends Book {

    public EBook() {
        System.out.println("EBook: No-arg constructor");
    }

    @Override
    public void open() {
        System.out.println("Opening an eBook on a digital device");
    }

    public void download(Book book) {
        if (book != null) {
            System.out.println("Downloading eBook to device storage");
        } else {
            System.out.println("Cannot download: book reference is null");
        }
    }
}
