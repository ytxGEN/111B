/*
Ye Htut Oo
CS 111B Chapter 9 Exercise
This program calculates the average of numbers from commandline arguments.
*/


public class Main {
    // Main method validate commandline arguments and process furthur by calling other methods.
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("usage: java Main 5 4 2 8");
            System.out.println("To average the numbers 5, 4, 2 and 8");

            return;
        }

        double[] nums = new double[args.length];
        double average;

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Double.parseDouble(args[i]);
        }

        System.out.println("Here is your array of numbers: ");
        printArray(nums);

        average = calculateAverage(nums);

        System.out.printf("And their average is : %.2f%n", average);

    }
    
    // Print out the elements in a array
    public static void printArray(double[] arr) {
        System.out.print("{" + arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println("}");
    }

    // Calculate the average of the elements in an array
    public static double calculateAverage(double[] arr) {
        double total = 0.0;

        for (double element: arr) {
            total += element;
        }

        return total / arr.length;
    }
}

/* Sample Output 1

yehtutoo@Yes-MacBook-Pro Chapter 9 Exercise % java Main.java 2.2 4.3 1.1 0.0
Here is your array of numbers: 
{2.2, 4.3, 1.1, 0.0}
And their average is : 1.90

*/

/* Sample Output 2

yehtutoo@Yes-MacBook-Pro Chapter 9 Exercise % java Main.java 5 4 3 2 1
Here is your array of numbers: 
{5.0, 4.0, 3.0, 2.0, 1.0}
And their average is : 3.00

*/