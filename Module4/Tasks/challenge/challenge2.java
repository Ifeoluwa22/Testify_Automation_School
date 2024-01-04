package challenge;

public class challenge2 {
    public static void main(String[] args) {
        String sentence = "I am the best Automation Tester";

        System.out.println("Original sentence: " + sentence);
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence: " + reversedSentence);
    }

    // Function to reverse the position of words in a sentence using recursion
    private static String reverseWords(String sentence) {
        if (sentence.isEmpty()) {
            return sentence;
        } else {
            // Find the index of the first space
            int spaceIndex = sentence.indexOf(' ');

            if (spaceIndex == -1) {
                // If there are no more spaces, return the remaining sentence
                return sentence;
            } else {
                // Recursively reverse the rest of the sentence and append the current word
                return reverseWords(sentence.substring(spaceIndex + 1)) + " " + sentence.substring(0, spaceIndex);
            }
        }
    }

}

// Reverse the position of words in "I am the best AutomationTester" using recursion