package com.java.intfce.external;

import com.java.intfce.internal.Network;

public class WireConnection implements Network {
    @Override
    public void Connection() {
        System.out.println("Connection is in WireConnection");
    }
}
