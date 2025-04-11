package com.xworkz.Override.external;

import com.xworkz.Override.internal.Report;

public class Analyst extends Report {

    public Analyst() {
        System.out.println("Analyst: No-arg constructor");
    }

    @Override
    public void generate() {
        System.out.println("Analyst generates a report with insights and visuals");
    }

    public void analyze(Report report) {
        if (report != null) {
            System.out.println("Analyst is analyzing the report for trends and outliers");
        } else {
            System.out.println("No report available for analysis");
        }
    }
}
