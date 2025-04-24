package com.java.intfce.external;

import com.java.intfce.internal.Mobile;

public class PocoPhone implements Mobile {
    @Override
    public void Call() {
        System.out.println("Mobile is in PocoPhone");
    }
}
