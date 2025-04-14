package com.xworkz.Override.external;

import com.xworkz.Override.internal.Actor;

public class Person  {
    public Person(){
        System.out.println("no arg const in person");
    }

    public void castCheck(Actor actor) {
        if (actor != null) {
            actor.act();
            if (actor instanceof Surya) {
                Surya soorya = (Surya) actor;
                soorya.act();
            } else {
                System.err.println("Surya is not an Actor");
            }
        } else {
            System.err.println("Surya is null");
        }
    }
}
