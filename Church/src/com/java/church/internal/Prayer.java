package com.java.church.internal;

     public class Prayer {
          public Prayer() {
              System.out.println("Running Prayer ");
          }
       public void Display() {
            System.out.println("Accessing public and default from internal package");
            Church church = new Church();
            church.useChurchLocally();
            church.defaultMethod();
        }
    }

