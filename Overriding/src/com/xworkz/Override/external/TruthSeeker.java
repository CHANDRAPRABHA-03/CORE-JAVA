package com.xworkz.Override.external;

import com.xworkz.Override.internal.Bad;

public class TruthSeeker {

    public TruthSeeker() {
        System.out.println("TruthSeeker: No-arg constructor");
    }

    public void investigate(Bad bad) {
        if (bad != null) {
            bad.reveal();

            if (bad instanceof Lie) {
                Lie lie = (Lie) bad;
                lie.coverUp(bad);
            } else {
                System.err.println("This bad is not a Lie");
            }
        } else {
            System.err.println("Nothing bad to investigate");
        }
    }
}
