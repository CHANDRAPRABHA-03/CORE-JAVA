package com.specifer.access.internal;

public class SpecialDarshan {

        //    Temple temple=new Temple();
        public SpecialDarshan(){
            System.out.println("Running SpecialDarshan const");
        }
        public void TempDisplay(){
            System.out.println("accessing public and default access specifiers from internal package");
            Temple temple = new Temple();
            temple.darshan_hall();
            temple.ticket_counter();

}
    }