public class Target {
    public static void main(String[] args) {

        String sentence = "This is an example sentence.";
        String targetWord = "example";

        boolean isPresent = sentence.contains(targetWord);

        if (isPresent) {
            System.out.println("The word \"" + targetWord + "\" is present in the sentence");
        }
        else
        {
            System.out.println("The word \"" + targetWord + "\" is not present in the sentence");
        }
    }
}