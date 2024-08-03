/*
Ye Htut Oo
CS 111B Chapter 7 Exercise
Display the names in revrse order and the longest name
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names;
        int size;

        System.out.print("How many names do you want to enter?: ");
        size = scan.nextInt();
        scan.nextLine(); // dispose newline character

        names = new String[size];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter a name: ");
            names[i] = scan.nextLine();
        }

        printReverse(names);
        printLongestName(names);

        scan.close(); // close the scanner
    }

    // Method to print the array in reverse order
    public static void printReverse(String[] arr) {
        System.out.println("Here are the names you entered, in reverse order:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    // Method to find and print the longest name in the array and its number of character
    public static void printLongestName(String[] arr) {
        int longestLength = 0;
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= longestLength) {
                longestLength = arr[i].length();
                index = i; 
            }
        }

        System.out.printf("Here is the longest name, with %d characters:%n", longestLength);
        System.out.println(arr[index]);
    }
}

/*
Sample Output 1:

How many names do you want to enter?: 3
Enter a name: Craig
Enter a name: Serafina
Enter a name: Tobias
Here are the names you entered, in reverse order:
Tobias
Serafina
Craig
Here is the longest name, with 8 characters:
Serafina
*/

/*
Sample Output 2:

How many names do you want to enter?: 6
Enter a name: Bob
Enter a name: Jane
Enter a name: Chi Hua
Enter a name: Alfonso
Enter a name: Andre
Enter a name: Anna
Here are the names you entered, in reverse order:
Anna
Andre
Alfonso
Chi Hua
Jane
Bob
Here is the longest name, with 7 characters:
Alfonso
*/