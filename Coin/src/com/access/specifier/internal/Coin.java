package com.access.specifier.internal;

public class Coin {
    public Coin(){
        System.out.println(" In no-arg coin constructor running");
    }
    public void toss(){
        System.out.println(" running public in toss");
    }
    void head(){
        System.out.println("running in default package");
    }
    private void tail(){
        System.out.println("  running in private");
    }
}
