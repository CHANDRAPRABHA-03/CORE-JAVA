package com.xworkz.Override.external;

import com.xworkz.Override.internal.Shell;

public class Ocean extends Shell {

    public Ocean() {
        System.out.println("Ocean: No-arg constructor");
    }

    @Override
    public void echo() {
        System.out.println("Ocean roars with power, holding countless shells");
    }

    public void cradle(Shell shell) {
        if (shell != null) {
            System.out.println("Ocean cradles the shell in its tides");
        } else {
            System.out.println("No shell to cradle in the deep");
        }
    }
}
