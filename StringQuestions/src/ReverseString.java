public class ReverseString {
    public static void main(String[] args) {

        String str = "CHANDRAPRABHA V";

        StringBuilder reversed = new StringBuilder(str);
        reversed.reverse();

        System.out.println("Reversed String: " + reversed.toString());
    }
}
