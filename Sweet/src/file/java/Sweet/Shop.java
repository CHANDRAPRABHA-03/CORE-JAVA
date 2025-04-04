package file.java.Sweet;

import java.util.Objects;

public class Shop {

    public Shop (Sweet sweet){

        System.out.println("Constructor Shop");
        if(Objects.nonNull(sweet))
        {
            sweet.box();
        }
        else {
            System.out.println("Null values occur");
        }
    }
    public void box(){
        System.out.println("Running in box method ");
    }
}
