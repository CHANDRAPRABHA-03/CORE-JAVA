package com.specifier.access.external;

import com.specifier.access.internal.Beach;

public class Fishing {
     public Fishing(){
         System.out.println("Running External Fishing");
     }
     public void Crab(){
         System.out.println("Running external crab method & calling public method from Beach");
         Beach beach = new Beach();
         beach.ship();
     }

}
