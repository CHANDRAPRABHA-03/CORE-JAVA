package com.luxury.Gold;

import java.util.Objects;

public class Jewelry {


    public Jewelry(Gold gold){
        System.out.println("Constructor JewelryItem");
        if(Objects.nonNull(gold))
        {
            gold.bangle();
        }
        else {
            System.out.println("null values occur");

        }
    }
    public void bangle(){
        System.out.println("Running in chain Method Jewelry");
    }
}
