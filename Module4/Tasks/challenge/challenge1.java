package challenge;

public class challenge1 {
    public static void main(String[] args) {
        String str1 = "racecar";
        String str2 = "10801";

        if (isPalindrome(str1)) {
            System.out.println(str1 + " is a palindrome.");
        } else {
            System.out.println(str1 + " is not a palindrome.");
        }

        if (isPalindrome(str2)) {
            System.out.println(str2 + " is a palindrome.");
        } else {
            System.out.println(str2 + " is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Removing spaces and converting to lowercase for case-insensitive comparison
        String cleanStr = str.replaceAll("\\s", "").toLowerCase();

        //String cleanStr = str1;
        int length = cleanStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
// Write  Java  code  to  check  if  racecar  and  10801  is  a palindromes.








