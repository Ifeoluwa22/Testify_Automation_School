package challenge;

public class challenge2 {
    public static void main(String[] args) {
        String initialSentence = "I am the best Automation Tester";

        System.out.println("The initial sentence was: " + initialSentence);
        String reversedSentence = reversed(initialSentence);
        System.out.println("The reversed sentence is: " + reversedSentence);
    }

    // Function to reverse the position of words in a sentence using recursion
    private static String reversed(String initial) {
        if (initial.isEmpty()) {
            return initial;
        } else {
            // We'll first find the index of the first space
            int spaceIndex = initial.indexOf(' ');

            if (spaceIndex == -1) {
                // Then at the end if there are no more spaces, return the remaining sentence
                return initial;
            } else {
                // Recursively reverse the rest of the sentence and append the current word
                return reversed(initial.substring(spaceIndex + 1)) + " " + initial.substring(0, spaceIndex);
            }
        }
    }

}

// Reverse the position of words in "I am the best AutomationTester" using recursion