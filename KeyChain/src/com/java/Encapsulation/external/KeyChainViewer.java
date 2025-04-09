package com.java.Encapsulation.external;

import com.java.Encapsulation.internal.KeyChain;

public class KeyChainViewer {
    public void viewKeyChain() {
        KeyChain keyChain = new KeyChain();

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Has Remote Access: " + keyChain.getHasRemoteAccess());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Owner Name: " + keyChain.getOwnerName());
    }
}
