package com.specifier.access.external;

import com.specifier.access.internal.Salon;

public class CombRunner {
    public static void main(String[] args) {
        Salon salon = new Salon();
        salon.useComb();

        BeautyParlor beautyParlor = new BeautyParlor();
        beautyParlor.externalCombAccess();
    }
}
