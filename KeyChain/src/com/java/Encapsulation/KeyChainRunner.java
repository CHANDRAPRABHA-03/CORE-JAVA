package com.java.Encapsulation;

import com.java.Encapsulation.internal.KeyChainUser;
import com.java.Encapsulation.external.KeyChainViewer;

public class KeyChainRunner {
    public static void main(String[] args) {
        KeyChainUser user = new KeyChainUser();
        user.displayKeyChain();

        System.out.println();

        KeyChainViewer viewer = new KeyChainViewer();
        viewer.viewKeyChain();
    }
}
