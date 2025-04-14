package com.java.typecast.runner;

import com.java.typecast.external.inverter;
import com.java.typecast.internal.Generator;

public class runner {
    public static void main(String[] args) {
        Generator generator = new Generator();   // parent
        generator.Generate();

        System.out.println();

        Generator generator1 = new inverter();  //child
        generator1.Generate();

        System.out.println();

        inverter inverter2 = (inverter) generator1; // typecast
        inverter2.Backup();
        //  method ref = (method)


        System.out.println();

        inverter inverter = new inverter();  // child
        inverter.Backup();
    }

}
