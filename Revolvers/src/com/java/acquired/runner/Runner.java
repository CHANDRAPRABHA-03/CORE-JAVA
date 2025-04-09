package com.java.acquired.runner;

import com.java.acquired.external.Revolver;
import com.java.acquired.internal.Tool;
import com.java.acquired.internal.Weapon;

public class Runner {
    public static void main(String[] args) {

        Tool tool = new Tool();
        System.out.println();
        Tool tool1 = new Weapon();
        System.out.println();
        Tool tool2 = new Revolver();

    }
}
