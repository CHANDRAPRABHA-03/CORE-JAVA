package com.java.intrfce.runner;

import com.java.intrfce.external.IplApp;
import com.java.intrfce.external.MysqlJdbc;
import com.java.intrfce.external.OracleJdbc;
import com.java.intrfce.internal.JDBC;

public class Runner {
    public static void main(String[] args) {
        JDBC jdbc = new OracleJdbc();
        JDBC jdbc1 = new MysqlJdbc();


        IplApp iplApp = new IplApp(jdbc1);
        iplApp.SaveTestinfo();



    }
}