package com.java.church.external;

import com.java.church.internal.Church;

public class Candle {
    public Candle (){
        System.out.println("Running in external Candle");
    }
    public void matchBox(){
        System.out.println("Running External MatchBox method and calling public method from church ");
        Church church =new Church();
        church.useChurchLocally();

    }
}
