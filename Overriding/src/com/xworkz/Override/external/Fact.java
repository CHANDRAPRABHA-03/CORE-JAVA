package com.xworkz.Override.external;

import com.xworkz.Override.internal.Truth;

public class Fact extends Truth {

    public Fact() {
        System.out.println("Fact: No-arg constructor");
    }

    @Override
    public void declare() {
        System.out.println("Fact is a proven truth supported by evidence");
    }

    public void validate(Truth truth) {
        if (truth != null) {
            System.out.println("Fact is validating the truth with logic and proof");
        } else {
            System.out.println("No truth to validate");
        }
    }
}
