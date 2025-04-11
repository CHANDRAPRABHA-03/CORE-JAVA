package com.xworkz.Override.external;

import com.xworkz.Override.internal.Camera;

public class Dslr extends Camera {

    public Dslr() {
        System.out.println("DSLR constructor called");
    }

    @Override
    public void capture() {
        System.out.println("Capturing high-resolution photo using DSLR");
    }

    public void zoomLens(Camera camera) {
        if (camera != null) {
            System.out.println("Zooming with DSLR lens");
        } else {
            System.out.println("Camera is null");
        }
    }
}
