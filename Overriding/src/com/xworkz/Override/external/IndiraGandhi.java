package com.xworkz.Override.external;

import com.xworkz.Override.internal.Leader;

public class IndiraGandhi extends Leader {

    public IndiraGandhi() {
        System.out.println("IndiraGandhi: No-arg constructor");
    }

    @Override
    public void serveNation() {
        System.out.println("Indira Gandhi served India as the first female Prime Minister");
    }

    public void emergencyPeriod(Leader leader) {
        if (leader != null) {
            System.out.println("Emergency was declared during Indira Gandhi's leadership");
        } else {
            System.out.println("No leader object provided");
        }
    }
}
