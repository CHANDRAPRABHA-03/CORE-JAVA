package com.java.intfce.external;

import com.java.intfce.internal.Mouse;

import java.util.Scanner;

public class NewMouse {
    private Mouse mouse;

    public NewMouse(Mouse mouse){
        this.mouse = mouse;
    }

    public void Scroll(){
        System.out.println("Mouse Scroll ");
        if(mouse!=null){
            this.mouse.Cursor();
        }else
        {
            System.out.println("Mouse Not scroll");
        }
    }
}
