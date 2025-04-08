package com.specifier.access.external;

import com.specifier.access.internal.Ocean;

public class Runner {
    public static void main(String[] args) {
        Ocean ocean = new Ocean();
        ocean.exploreShell();

        Museum museum = new Museum();
        museum.viewShell();
    }
}
