package challenge;

public class challenge7 {

    // Creating a function to reverse a string using recursion like challenge 2
    private static String reversedString(String str) {
        if ((str == null) || (str.length()<=1)) {
            return str;
        } else {
            // Concatenate the last character with the reversed substring of the rest of the string
            return str.charAt(str.length() - 1) + reversedString(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        String initial = "TestifyAutomation";
        String reversed = reversedString(initial); //recursive function call to reversedString()

        System.out.println("The initial string was: " + initial); //Printing out the result
        System.out.println("The reversed string is: " + reversed);
    }
}

// Reverse "TestifyAutomation" using recursion in Java