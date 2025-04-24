package com.java.intrfce.external;

import com.java.intrfce.internal.JDBC;

public class IplApp {
    private JDBC jdbc;

    public IplApp(JDBC jdbc){
        this.jdbc=jdbc;
    }
    public void SaveTestinfo(){
        System.out.println("Ipl App is not null");
        if(jdbc!= null){
            this.jdbc.Save();
        }
        else {
            System.out.println("Ipl App");
        }
    }
}