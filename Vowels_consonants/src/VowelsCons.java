public class VowelsCons {
    public static void main(String[] args) {
        String input = "you are welcome";
        String output = "";

        input = input.toLowerCase(); // Normalize to lowercase

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if it's a vowel
            if (ch == 'a') output += 'b';
            else if (ch == 'e') output += 'f';
            else if (ch == 'i') output += 'j';
            else if (ch == 'o') output += 'p';
            else if (ch == 'u') output += 'v';
            else output += ch; // Leave consonants and other characters unchanged
        }

        System.out.println("Original : " + input);
        System.out.println("Modified : " + output);
    }
}
