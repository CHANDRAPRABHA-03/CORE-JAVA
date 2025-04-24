package com.java.intfce.external;

import com.java.intfce.internal.WaterFilter;

public class AquaWaterFilter implements WaterFilter {
    @Override
    public void Filter() {
        System.out.println("WaterFilter is in AquaWaterFilter");
    }
}
