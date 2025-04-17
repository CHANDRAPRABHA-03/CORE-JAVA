public class TotalChar {
    public static void main(String[] args) {
        // Input sentence
        String sentence = "Count the characters in this sentence!";

        // Initialize counter
        int charCount = 0;

        // Traverse the sentence
        for (char ch : sentence.toCharArray()) {
            if (!Character.isWhitespace(ch)) { // Exclude spaces
                charCount++;
            }
        }

        // Output the count
        System.out.println("Number of characters (excluding spaces): " + charCount);
    }
}
