package com.java.intfce.external;

import com.java.intfce.internal.Network;

public class NewNetwork {
    private Network network;

    public  NewNetwork(Network network){
        this.network = network;
    }

    public void NetworkWifi(){
        System.out.println("NetworkWifi is a type of Connection");
        if (network!=null){
            this.network.Connection();
        }
        else {
            System.out.println("Network is a not Null");
        }
    }
}
