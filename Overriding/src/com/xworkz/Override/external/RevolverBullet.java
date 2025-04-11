package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bullet;

public class RevolverBullet extends Bullet {

    public RevolverBullet() {
        System.out.println("RevolverBullet: No-arg constructor");
    }

    @Override
    public void fire() {
        System.out.println("Firing a revolver bullet with a loud bang!");
    }

    public void loadIntoChamber(Bullet bullet) {
        if (bullet != null) {
            System.out.println("Revolver bullet loaded into chamber");
        } else {
            System.out.println("No bullet to load");
        }
    }
}
