package com.specifier.access.external;

import com.specifier.access.internal.Pearl;

public class BeachRunner {
    public static void main(String[] args) {
        Pearl pearl = new Pearl();
        pearl.Display();
        Fishing fishing = new Fishing();
        fishing.Crab();
    }
}
