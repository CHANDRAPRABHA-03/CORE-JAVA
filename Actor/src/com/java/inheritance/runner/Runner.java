package com.java.inheritance.runner;

import com.java.inheritance.external.Actor;
import com.java.inheritance.internal.Human;
import com.java.inheritance.internal.Person;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        System.out.println();
        Human human1 = new Person();
        System.out.println();
        Human human2 = new Actor();

    }
}
