package vipul.basic;

/**
 * Given a string S, check if it is palindrome or not.
 */
public class Palindrome {

    public static void isPalindrome(String s) {
        boolean isPalindrome = true;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("String is palindrome");
        } else {
            System.out.println("String is not palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome("hannah");
    }
}
