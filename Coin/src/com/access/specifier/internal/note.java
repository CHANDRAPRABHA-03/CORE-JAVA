package com.access.specifier.internal;

public class note {
     public note(){
         System.out.println("running note constructor");
     }
     public void Display(){

         System.out.println("accessing public and default from internal");
         Coin coin  = new Coin();
         coin.head();
         coin.toss();
     }
}
