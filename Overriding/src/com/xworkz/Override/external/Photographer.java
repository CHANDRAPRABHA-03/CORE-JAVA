package com.xworkz.Override.external;

import com.xworkz.Override.internal.Camera;

public class Photographer {

    public Photographer() {
        System.out.println("Photographer constructor called");
    }

    public void takePhoto(Camera camera) {
        if (camera != null) {
            camera.capture();

            if (camera instanceof Dslr) {
                Dslr dslr = (Dslr) camera;
                dslr.zoomLens(camera);
            } else {
                System.out.println("This is not a DSLR, just a regular Camera");
            }
        } else {
            System.out.println("Camera is null, cannot take a photo.");
        }
    }
}
