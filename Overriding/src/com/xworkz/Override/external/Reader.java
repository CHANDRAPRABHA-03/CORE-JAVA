package com.xworkz.Override.external;

import com.xworkz.Override.internal.Book;

public class Reader {

    public Reader() {
        System.out.println("Reader: No-arg constructor");
    }

    public void read(Book book) {
        if (book != null) {
            book.open();

            if (book instanceof EBook) {
                EBook ebook = (EBook) book;
                ebook.download(book);
            } else {
                System.err.println("This book is not an EBook");
            }
        } else {
            System.err.println("Book is null");
        }
    }
}
