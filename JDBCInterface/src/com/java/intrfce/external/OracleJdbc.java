package com.java.intrfce.external;

import com.java.intrfce.internal.JDBC;

public class OracleJdbc implements JDBC {
    @Override
    public void Save() {
        System.out.println("Jdbc Running in OracleJdbc");
    }
}
