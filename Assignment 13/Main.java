/*
 * YE HTUT OO
 * CS 111B
 * Assignment 13: Robust Array From String
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size, index;
        int[] nums;
        String myString;
        String[] myArray;
        
        while (true) {
            try {
                System.out.print("How many numbers do you want to enter? ");
                size = Integer.parseInt(scan.nextLine());
                nums = new int[size];
                break;
            }
            catch(NumberFormatException e) {
                System.out.println("You must enter an integer");
            }
            catch(NegativeArraySizeException e) {
                System.out.println("You must enter a positive number");
            }
        }

        while (true) {
            try {
                System.out.printf("Enter your %d numbers, separated by spaces:\n", size);
                myString = scan.nextLine();
                myArray = myString.split(" ");

                for (int i = 0; i < myArray.length; i++) {
                    nums[i] = Integer.parseInt(myArray[i]);
                }

                break;
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("You must enter at least one integer, with spaces separating the integers.");
            }
            catch(NumberFormatException e) {
                System.out.println("You must enter at least one integer, with spaces separating the integers.");
            }
        }

        while (true) {
            try {
                System.out.print("Enter the index of the number you want to see: ");
                index = Integer.parseInt(scan.nextLine());
                System.out.println("element number " + index + " = " + nums[index]);
                System.out.println("if you double it, that's " + nums[index] * 2);
                break;
            }
            catch(NumberFormatException e) {
                System.out.printf("You must enter an integer between 0 and %d\n", size - 1);
            }
            catch(ArrayIndexOutOfBoundsException e) {
                System.out.printf("You must enter an integer between 0 and %d\n", size - 1);
            }
            catch(NegativeArraySizeException e) {
                System.out.printf("You must enter an integer between 0 and %d\n", size - 1);
            }
        }

        scan.close();
    }
}

/*
****** OUTPUT ******

How many numbers do you want to enter? three
You must enter an integer
How many numbers do you want to enter? 3.4
You must enter an integer
How many numbers do you want to enter? -1
You must enter a positive number
How many numbers do you want to enter? 3
Enter your 3 numbers, separated by spaces:
one two three
You must enter at least one integer, with spaces separating the integers.
Enter your 3 numbers, separated by spaces:
1.5 2 3
You must enter at least one integer, with spaces separating the integers.
Enter your 3 numbers, separated by spaces:
2 3 4 5 6
Enter the index of the number you want to see: one
You must enter an integer between 0 and 2
Enter the index of the number you want to see: -1
You must enter an integer between 0 and 2
Enter the index of the number you want to see: 1.5
You must enter an integer between 0 and 2
Enter the index of the number you want to see: 2
element number 2 = 4
if you double it, that's 8

----------------------------------------------

How many numbers do you want to enter? 3.2
You must enter an integer
How many numbers do you want to enter? 4
Enter your 4 numbers, separated by spaces:
2.3 3
You must enter at least one integer, with spaces separating the integers.
Enter your 4 numbers, separated by spaces:
2 3 4 5 6
Enter the index of the number you want to see: 5
You must enter an integer between 0 and 3
Enter the index of the number you want to see: 3
element number 3 = 5
if you double it, that's 10
*/