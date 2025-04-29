public class RcbMatch {

    public static void main(String[] args) {
        String str = "rcb will win the match";
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (i == 2 || i == 3) {
                words[i] = new StringBuilder(words[i]).reverse().toString();
            }
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}




