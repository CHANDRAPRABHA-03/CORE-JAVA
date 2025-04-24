package com.java.intfce.external;

import com.java.intfce.internal.WaterFilter;

public class NewWaterFilter {
    private WaterFilter waterFilter;

    public NewWaterFilter(WaterFilter waterFilter){
        this.waterFilter = waterFilter;
    }

    public void RemoveDust(){
        System.out.println("RemoveDusts");
        if (waterFilter != null){
            this.waterFilter.Filter();
        }else
        {
            System.out.println("not RemoveDust");
        }
    }
}
