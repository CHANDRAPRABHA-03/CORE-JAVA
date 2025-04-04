package file.java.Sweet;

public class SweetRunner {
    public static void main (String[] args){
        Sweet sweet = new Sweet();
        Shop shop = new Shop(sweet);
        shop.box();
    }
}
