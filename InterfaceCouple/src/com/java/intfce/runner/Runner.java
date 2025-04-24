package com.java.intfce.runner;

import com.java.intfce.external.MobileNetwork;
import com.java.intfce.external.NewNetwork;
import com.java.intfce.external.WireConnection;
import com.java.intfce.internal.Network;

public class Runner {
    public static void main(String[] args) {
        Network network = new WireConnection();
        Network network1 = new MobileNetwork();

        NewNetwork newNetwork = new NewNetwork(network);

        newNetwork.NetworkWifi();





    }
}
