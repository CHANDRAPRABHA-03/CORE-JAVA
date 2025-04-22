package com.xworkz.kf.internal.rule;

public class IskconTempleImpl implements Temple,TempleTrust,IskconTemple{
    @Override
    public void parking() {
        System.out.println("parking is in the IskconTempleImpl");
    }

    @Override
    public void slipper() {
        System.out.println("slipper is in the IskconTempleImpl");
    }

    @Override
    public void donation() {
        System.out.println("donation is in the IskconTempleImpl");
    }
}
