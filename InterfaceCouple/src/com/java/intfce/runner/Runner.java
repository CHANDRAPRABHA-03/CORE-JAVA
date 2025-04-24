package com.java.intfce.runner;

import com.java.intfce.external.*;
import com.java.intfce.internal.Mouse;
import com.java.intfce.internal.Network;
import com.java.intfce.internal.Refrigerator;

public class Runner {
    public static void main(String[] args) {
        Network network = new WireConnection();
        Network network1 = new MobileNetwork();
        NewNetwork newNetwork = new NewNetwork(network);
        newNetwork.NetworkWifi();

        System.out.println("********");

        Refrigerator refrigerator = new MiniRefrigerator();
        Refrigerator refrigerator1 = new DoubleDoor();
        NewRefrigerator newRefrigerator = new NewRefrigerator();
        newRefrigerator.Samsung();

        System.out.println("*********");

        Mouse mouse = new SmartMouse();
        Mouse mouse1 = new WiredMouse();
        NewMouse newMouse = new NewMouse(mouse);
        newMouse.Scroll();

        System.out.println("*********");



    }
}
