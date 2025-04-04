package com.java.Liver;

public class LiverRunner {
    public static void main(String [] args){
       Liver liver = new Liver();
        HumanBody humanBody = new HumanBody(liver);
        liver.Cancer();

    }
}
