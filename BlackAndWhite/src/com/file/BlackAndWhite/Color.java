package com.file.BlackAndWhite;

import java.util.Objects;

public class Color {

        public Color(BlackAndWhite blackAndWhite){
            System.out.println("Black and White is a color");
            if(Objects.nonNull(blackAndWhite)) {
                blackAndWhite.brand();
            }
            else
            {
                System.out.println("Null values Occur");
            }
        }
        public void brand(){
            System.out.println("Running in brand ");
        }
}
