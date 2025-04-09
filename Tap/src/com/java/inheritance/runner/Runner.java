package com.java.inheritance.runner;

import com.java.inheritance.external.Tap;
import com.java.inheritance.internal.Academy;
import com.java.inheritance.internal.Organization;

public class Runner {
    public static void main(String[] args) {
        Organization organization = new Organization();
        Organization organization1 =  new Academy();
        Organization organization2 = new Tap();
    }
}
