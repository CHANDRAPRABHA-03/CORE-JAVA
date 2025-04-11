package com.xworkz.Override.external;

import com.xworkz.Override.internal.Mobile;

public class Tab extends Mobile {
    public Tab(){
        System.out.println("no argument constructor in Tab");
    }

    @Override
    public void ScreenOff() {
        System.out.println("Overriding of TouchScreen");
    }

    public void rotate(Mobile mobile) {
        if (mobile != null) {
            System.out.println("Rotation is in Mobile");
        } else {
            System.out.println("Rotating is null");
        }
    }
}
