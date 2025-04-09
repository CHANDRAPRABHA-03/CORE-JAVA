package com.java.inheritance.runner;

import com.java.inheritance.external.Lock;
import com.java.inheritance.internal.Security;

public class Runner {
    public static void main(String[] args) {
        Security security = new Security();
        System.out.println();
        Security security1 = new Lock();
    }
}
