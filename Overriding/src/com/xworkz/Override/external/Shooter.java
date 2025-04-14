package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bullet;

public class Shooter {

    public Shooter() {
        System.out.println("Shooter: No-arg constructor");
    }

    public void shoot(Bullet bullet) {
        if (bullet != null) {
            bullet.fire();

            if (bullet instanceof RevolverBullet) {
                RevolverBullet revolverBullet = (RevolverBullet) bullet;
                revolverBullet.loadIntoChamber(bullet);
            } else {
                System.err.println("This bullet is not a RevolverBullet");
            }
        } else {
            System.err.println("Bullet is null");
        }
    }
}
