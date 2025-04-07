package com.specifier.access.internal;

public class Pearl {
    public Pearl(){
        System.out.println("RUnning Pearl");
    }
    public void Display(){
        System.out.println("Accessing public and default specifier from internal ");
        Beach beach = new Beach();
        beach.Playing();
        beach.ship();

    }
}
