package com.xworkz.Override.external;

import com.xworkz.Override.internal.Notification;

public class App extends Notification {

    public App() {
        System.out.println("App: No-arg constructor");
    }

    @Override
    public void alert() {
        System.out.println("App sends a push notification to the user");
    }

    public void display(Notification notification) {
        if (notification != null) {
            System.out.println("App displays the notification on the screen");
        } else {
            System.out.println("No notification to display");
        }
    }
}
