package challenge;

public class challenge1 {
    public static void main(String[] args) {
        String firstText = "racecar"; // instantiating the string in a variable
        String secondText = "10801"; // One of the methods of checking if a number is a Palindrome is by converting it to a string

        if (isPalindrome(firstText)) {
            System.out.println(firstText + " is a palindrome.");
        } else {
            System.out.println(firstText + " is not a palindrome.");
        }

        if (isPalindrome(secondText)) {
            System.out.println(secondText + " is a palindrome.");
        } else {
            System.out.println(secondText + " is not a palindrome.");
        }
    }

    // Now we write a function to check if the string is a palindrome
    private static boolean isPalindrome (String str) {
        int length = str.length() - 1;
        for (int i = 0; i < length; i++ , length --) {
            if (str.charAt(i) != str.charAt(length)) {
                return false;
            }
        }
        return true;
    }
}
// Write  Java  code  to  check  if  racecar  and  10801  is  a palindromes.








