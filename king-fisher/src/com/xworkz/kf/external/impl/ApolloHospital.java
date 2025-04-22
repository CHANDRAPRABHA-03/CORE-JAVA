package com.xworkz.kf.external.impl;

import com.xworkz.kf.internal.rule.Hospital;

public class ApolloHospital implements Hospital {

    @Override
    public void clean() {
        System.out.println("Clean is running in ApolloHospital");
    }
}
