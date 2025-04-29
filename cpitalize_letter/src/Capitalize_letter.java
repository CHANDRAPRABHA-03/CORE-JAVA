public class Capitalize_letter {
    public static void main(String[] args) {
        String input = "hello how are you all set to go home";
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Capitalize first letter and keep rest as lowercase
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }

        // Trim the trailing space
        System.out.println("Output: " + result.toString().trim());
    }
}
