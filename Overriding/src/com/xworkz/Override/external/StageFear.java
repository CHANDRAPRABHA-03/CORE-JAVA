package com.xworkz.Override.external;

import com.xworkz.Override.internal.Fear;

public class StageFear extends Fear {

    public StageFear() {
        System.out.println("StageFear: No-arg constructor");
    }

    @Override
    public void express() {
        System.out.println("StageFear: Sweaty hands, trembling voice, blank mind");
    }

    public void overcome(Fear fear) {
        if (fear != null) {
            System.out.println("Overcoming stage fear through practice and confidence");
        } else {
            System.out.println("No fear to overcome");
        }
    }
}
