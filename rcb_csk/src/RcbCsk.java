public class RcbCsk {
    public static void main(String[] args) {
        System.out.println("rcb will win the match against csk");
        String words = "rcb will win the match against csk";
        String[] strings = words.split(" ");

            for (String word : strings) {
                System.out.print(word.length() + " ");
            }
        }
    }
