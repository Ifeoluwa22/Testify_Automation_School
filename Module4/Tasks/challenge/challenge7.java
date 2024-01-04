package challenge;

public class challenge7 {
    public static void main(String[] args) {
        String original = "TestifyAutomation";

        String reversed = reverseString(original);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    // Function to reverse a string using recursion
    private static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        } else {
            // Concatenate the last character with the reversed substring of the rest of the string
            return str.charAt(str.length() - 1) + reverseString(str.substring(0, str.length() - 1));
        }
    }
}

// Reverse "TestifyAutomation" using recursion in Java