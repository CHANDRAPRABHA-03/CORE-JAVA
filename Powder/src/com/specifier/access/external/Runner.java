package com.specifier.access.external;

import com.specifier.access.internal.MakeupKit;

public class Runner {
    public static void main(String[] args) {
        MakeupKit makeupKit = new MakeupKit();
        makeupKit.usePowder();

        FashionShow fashionShow = new FashionShow();
        fashionShow.externalPowderUse();
    }
}
