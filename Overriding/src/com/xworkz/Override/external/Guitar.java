package com.xworkz.Override.external;

import com.xworkz.Override.internal.Instrument;

public class Guitar extends Instrument {

    public Guitar() {
        System.out.println("Guitar constructor called");
    }

    @Override
    public void play() {
        System.out.println("Strumming the guitar");
    }

    public void tune(Instrument instrument) {
        if (instrument != null) {
            System.out.println("Tuning the guitar strings");
        } else {
            System.out.println("Instrument is null, can't tune");
        }
    }
}
