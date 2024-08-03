/* MidtermReviewStarter
Starter Code for CS 111B Midterm Review Exercise 

This program asks the user to enter 5 numbers,
storing them in an array of ints. Then the 
program outputs the smallest of those numbers
and makes a Point object store the array's
first two numbers as its coordinates.
Finally, the program inputs the user's last
name and outputs "Hello Mx." followed by their 
last initial.  You can see sample
output at the end of this file.

The main method has been written for you below,
except that it needs a few more lines of code.
DO NOT CHANGE THE MAIN METHOD code given to you,
simply ADD to the end of it.
PLEASE WRITE THE FOLLOWING 3 FUNCTIONS THAT ARE 
NEEDED TO COMPLETE THE PROGRAM:
1) inputNums: Input and return an array of ints, 
with the specified number of elements (one int parameter).
2) changePoint: Has two parameters: a Point object and
an array of ints. Makes the Point object store the first
two elements of the array as its coordinates.
3) outputMin: Has 1 parameter: an array of ints.
Outputs the smallest number in the array.

Your completed program should work to produce output
like shown at the end of this file. But please replace
that with the output you get when you run it.

Remember to indent properly, and include comments with 
each function, and also modify this comment at the top
of the program to have your name.
*/

/**
 * @author Ye Htut Oo
 */

import java.util.Scanner;
import java.awt.Point;

class Main
{
    static Scanner keyIn = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] nums;
        String lastName;
        char lastInitial;
        Point myPoint = new Point();

        System.out.println("Please enter 5 numbers:"); 
        nums = inputNums(5);

        outputMin(nums);

        changePoint(myPoint, nums);
        System.out.println("The first two numbers are now stored in this object:");
        System.out.println(myPoint);

        // DO NOT CHANGE THE ABOVE CODE

        // PLEASE WRITE THE MISSING CODE HERE
        // to input the last name and output
        // the initial.

        System.out.print("Please enter your last name: ");
        lastName = keyIn.nextLine();
        lastInitial = lastName.charAt(0);
        System.out.printf("Hello Mx. %c%n", lastInitial);
    }

    // PLEASE WRITE YOUR 3 FUNCTIONS HERE
    /**
     * Input and return an array of ints, 
     * with the specified number of elements (n)
     * 
     * @param n number of inputs
     * @return array of inputs
     */
    public static int[] inputNums(int n) {
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(keyIn.nextLine());
        }

        return arr;
    }

    /**
     * Method to output the smallest number in an array.
     * 
     * @param nums input array
     */
    public static void outputMin(int[] nums) {
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        System.out.printf("The smallest value is %d%n", min);
    }

    /**
     * This method store the first two elements of the array 
     * as the Point object's coordinates.
     * 
     * @param p
     * @param nums
     */
    public static void changePoint(Point p, int[] nums) {
        p.x = nums[0];
        p.y = nums[1];
    }
}

/* Sample output 
(PLEASE REPLACE THIS WITH THE OUTPUT THAT YOU GET):

Please enter 5 numbers:
9
8
7
6
5
The smallest value is 5
The first two numbers are now stored in this object:
java.awt.Point[x=9,y=8]
Please enter your last name: Htut
Hello Mx. H

Please enter 5 numbers:
1
2
3
4
5
The smallest value is 1
The first two numbers are now stored in this object:
java.awt.Point[x=1,y=2]
Please enter your last name: Oo
Hello Mx. O

*/