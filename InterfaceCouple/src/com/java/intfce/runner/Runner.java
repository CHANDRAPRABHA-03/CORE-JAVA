package com.java.intfce.runner;

import com.java.intfce.external.*;
import com.java.intfce.internal.*;

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

        Mobile mobile = new OppoPhone();
        Mobile mobile1 = new PocoPhone();
        NewMobile newMobile = new NewMobile(mobile1);
        newMobile.Communication();

        System.out.println("***********");

        WaterFilter waterFilter = new AquaWaterFilter();
        WaterFilter waterFilter1 = new HavellsWaterFilter();
        NewWaterFilter newWaterFilter = new NewWaterFilter(waterFilter1);
        newWaterFilter.RemoveDust();
    }
}
