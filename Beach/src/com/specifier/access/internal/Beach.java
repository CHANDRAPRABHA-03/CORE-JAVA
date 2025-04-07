package com.specifier.access.internal;

public class Beach {
    public Beach(){
        System.out.println(" Beach ,no -arg Beach");
    }
     public void ship (){
        System.out.println("ship ,public Constructor");
    }
     void Playing (){
        System.out.println("Playing  , Running in default");
     }
     private void Boating() {
        System.out.println(" Boating, Running in private method");
     }
}
