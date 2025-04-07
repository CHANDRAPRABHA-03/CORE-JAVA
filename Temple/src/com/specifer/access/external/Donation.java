package com.specifer.access.external;

import com.specifer.access.internal.Temple;

public class Donation {

    public Donation(){

        System.out.println("Running external Donation construct");
    }
    public void outsideSpace(){
        System.out.println("Running external outsideSpace method and calling public method from temple");
        Temple temple = new Temple();
        temple.ticket_counter();
}
}

