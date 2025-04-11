package com.xworkz.Override.external;

import com.xworkz.Override.internal.Chrome;

public class GoogleChrome extends Chrome {

    public GoogleChrome() {
        System.out.println("GoogleChrome: No-arg constructor");
    }

    @Override
    public void launch() {
        System.out.println("Launching Google Chrome with enhanced features.");
    }

    public void browseIncognito(Chrome chrome) {
        if (chrome != null) {
            System.out.println("Browsing in incognito mode...");
        } else {
            System.out.println("Browser instance is null.");
        }
    }
}
