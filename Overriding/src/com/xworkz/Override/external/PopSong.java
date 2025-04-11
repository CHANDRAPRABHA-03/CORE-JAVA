package com.xworkz.Override.external;

import com.xworkz.Override.internal.Song;

public class PopSong extends Song {

    public PopSong() {
        System.out.println("PopSong: No-arg constructor");
    }

    @Override
    public void play() {
        System.out.println("Playing a catchy pop song");
    }

    public void danceToBeat(Song song) {
        if (song != null) {
            System.out.println("Dancing to the rhythm of the pop song!");
        } else {
            System.out.println("No song to dance to");
        }
    }
}
