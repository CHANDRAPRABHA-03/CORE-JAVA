package com.xworkz.Override.external;

import com.xworkz.Override.internal.Podcast;

public class Host extends Podcast {

    public Host() {
        System.out.println("Host: No-arg constructor");
    }

    @Override
    public void stream() {
        System.out.println("Host engages audience and streams live content");
    }

    public void introduce(Podcast podcast) {
        if (podcast != null) {
            System.out.println("Host is introducing the podcast episode");
        } else {
            System.out.println("No podcast to introduce");
        }
    }
}
