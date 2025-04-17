public class CountSpaces {
    public static void main(String[] args) {

        String sentence = "Count the number of spaces in this sentence";

        int spaceCount = 0;

        for (char ch : sentence.toCharArray()) {
            if (ch == ' ') {
                spaceCount++;
            }
        }

        System.out.println("Number of spaces: " + spaceCount);
    }
}
