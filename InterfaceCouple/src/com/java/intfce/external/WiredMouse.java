package com.java.intfce.external;

import com.java.intfce.internal.Mouse;

public class WiredMouse implements Mouse {
    @Override
    public void Cursor() {
        System.out.println("Mouse is in WiredMouse");
    }
}
