package com.java.intrfce.external;

import com.java.intrfce.internal.JDBC;

public class MysqlJdbc implements JDBC {
    @Override
    public void Save() {
        System.out.println("Jdbc Running in MysqlJdbc");
    }
}
