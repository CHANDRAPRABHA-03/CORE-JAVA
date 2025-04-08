package com.specifier.access.external;

import com.specifier.access.internal.Surveillance;

public class DroneRunner {
    public static void main(String[] args) {
        Surveillance surveillance = new Surveillance();
        surveillance.droneOperations();

        Delivery delivery = new Delivery();
        delivery.droneAccessExternal();
    }
}
