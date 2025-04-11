package com.xworkz.Override.external;

import com.xworkz.Override.internal.File;

public class HardDrive extends File {

    public HardDrive() {
        System.out.println("HardDrive: No-arg constructor");
    }

    @Override
    public void store() {
        System.out.println("HardDrive writes the file onto a magnetic disk");
    }

    public void read(File file) {
        if (file != null) {
            System.out.println("HardDrive is reading the file from disk");
        } else {
            System.out.println("No file to read — directory is empty");
        }
    }
}
