package com.java.typecast.external;

import com.java.typecast.internal.Generator;

public class inverter extends Generator {
    public inverter(){
        System.out.println("inverter is in inverter");
    }

    @Override
    public void Generate() {
        System.out.println("Generate is also in inverter");
    }

    public void Backup(){
        System.out.println("Backup is  in inverter");
    }
}
