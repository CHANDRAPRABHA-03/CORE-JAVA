package com.xworkz.Override.external;

import com.xworkz.Override.internal.Key;

public class Lock extends Key {

    public Lock() {
        System.out.println("Lock: No-arg constructor");
    }

    @Override
    public void open() {
        System.out.println("Lock opens only when the right key is used");
    }

    public void secure(Key key) {
        if (key != null) {
            System.out.println("Lock is secured with the help of the key");
        } else {
            System.out.println("No key — lock stays locked");
        }
    }
}
