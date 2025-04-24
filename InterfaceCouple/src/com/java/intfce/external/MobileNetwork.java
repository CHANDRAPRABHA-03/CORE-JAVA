package com.java.intfce.external;

import com.java.intfce.internal.Network;

public class MobileNetwork implements Network {
    @Override
    public void Connection() {
        System.out.println("Connection is in Mobile Network");
    }
}
