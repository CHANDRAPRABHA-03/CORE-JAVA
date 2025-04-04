package com.java.Umbrella;

import java.util.Objects;

public class Rain {

    public Rain(Umbrella umbrella){
        System.out.println("Constructor Umbrella");
        if(Objects.nonNull(umbrella)) {
            umbrella.open();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void open(){
        System.out.println("Running in open ");
    }
}
