package com.java.intfce.external;

import com.java.intfce.internal.Mobile;

public class NewMobile {
    private Mobile mobile;

    public NewMobile(Mobile mobile){
        this.mobile = mobile;
    }

    public void Communication(){
        System.out.println("Communications");
        if(mobile!= null){
            this.mobile.Call();
        }else
        {
            System.out.println("Not Communication");
        }
    }
}
