package com.java.church.internal;

public class Church {

    public  Church() {
        System.out.println("Church: public method");
    }

    public void useChurchLocally()
    {
        System.out.println("Running  in public ");
    }
    void defaultMethod() {
        System.out.println("Church: package default method");
    }

    private void privateMethod() {
        System.out.println("Church: private method");
    }


}
