package com.java.Encapsulation.internal;

public class KeyChainUser {
    public void displayKeyChain() {
        KeyChain keyChain = new KeyChain();

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Number of Keys: " + keyChain.getNumberOfKeys());
        System.out.println("Has Remote Access: " + keyChain.getHasRemoteAccess());
        System.out.println("Color: " + keyChain.getColor());
        System.out.println("Owner Name: " + keyChain.getOwnerName());

        // Modify details
        keyChain.setMaterial("Leather");
        keyChain.setNumberOfKeys(8);
        keyChain.setHasRemoteAccess(true);
        keyChain.setColor("Black");
        keyChain.setOwnerName("Jordan");

        System.out.println("Updated Owner Name: " + keyChain.getOwnerName());
    }
}
