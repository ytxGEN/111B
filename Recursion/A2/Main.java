/**
 * Name : YE HTUT OO
 * Extra-Credit Programming Assignment 15: Recursive Palindrome
 */
import java.util.Scanner;

public class Main {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String s;

        System.out.print("Please enter a word: ");
        s = scan.nextLine();

        if (isPalindrome(s)) {
            System.out.println("Yes, " + s + " is a palindrome.");
        } else {
            System.out.println("No, " + s + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1 || s.isEmpty()) {
            return true;
        }

        char first_char = s.charAt(0);
        char last_char = s.charAt(s.length() - 1);

        // if first character equals last charcter, 
        // remove them from the string and check the new string again recursively
        if (first_char == last_char) {
            return true && isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }

    }
}

/* OUTPUT

Please enter a word: ava
Yes, ava is a palindrome.

Please enter a word: abba
Yes, abba is a palindrome.

Please enter a word: a
Yes, a is a palindrome.

Please enter a word: abc
No, abc is not a palindrome.

Please enter a word: elephant 
No, elephant is not a palindrome.
*/