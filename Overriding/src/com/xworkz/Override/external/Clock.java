package com.xworkz.Override.external;

import com.xworkz.Override.internal.Time;

public class Clock extends Time {

    public Clock() {
        System.out.println("Clock: No-arg constructor");
    }

    @Override
    public void tick() {
        System.out.println("Clock ticks rhythmically to represent passing time");
    }

    public void display(Time time) {
        if (time != null) {
            System.out.println("Clock displays the current moment of time");
        } else {
            System.out.println("No time available — clock can't function");
        }
    }
}
