package com.java.intfce.external;

import com.java.intfce.internal.Refrigerator;

public class NewRefrigerator{
    private Refrigerator refrigerator;

    public NewRefrigerator(){
        this.refrigerator = refrigerator;
    }

    public void Samsung(){
        System.out.println("Samsung is in NewRefrigerator");
        if (refrigerator!= null){
            this.refrigerator.Cool();
        }
        System.out.println("it is null");
    }
}
