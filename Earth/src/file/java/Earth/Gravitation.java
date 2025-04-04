package file.java.Earth;

import java.util.Objects;

public class Gravitation {

    public Gravitation(Earth earth){
        System.out.println("Constructor Gravitation");
        if(Objects.nonNull(earth)) {
            earth.Galaxy();
        }
        else
        {
            System.out.println("Null values Occur");
        }
    }
    public void Galaxy(){
        System.out.println("Running in Galaxy ");
    }
}
