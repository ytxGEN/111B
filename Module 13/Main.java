/*
 * YE HTUT OO
 * CS 111B
 * Programming Exercise for Exception Handling
 * 
 * Shows how a 2-D array can be jagged: have different numbers of columns for each row.
 * Inputs test scores for courses - each course can have a different number of tests.
 */

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num_courses, num_tests;

        double[][] test_scores;

        while(true){
            try {
                System.out.print("How many courses are you taking? ");
                num_courses = scan.nextInt();
                test_scores = new double[num_courses][];
                break;
            }
            catch(InputMismatchException e) {
                System.out.println("You must enter an integer");
                scan.nextLine();
            }
            catch(NegativeArraySizeException e) {
                System.out.println("You must enter a positive number");
                scan.nextLine();
            }
        }

            
        for(int i = 0; i < num_courses; i++){
            while(true) {
                try {
                    System.out.print("How many tests are in course number " + (i+1) + "? ");
                    num_tests = scan.nextInt();
                    // allocate this row: a 1-D array of doubles:
                    test_scores[i] = new double[num_tests];
                    break;
                }
                catch(InputMismatchException e) {
                    System.out.println("You must enter an integer");
                    scan.nextLine();
                }
                catch(NegativeArraySizeException e) {
                    System.out.println("You must enter a positive number");
                    scan.nextLine();
                }
            }
        }


        for(int course_id=0; course_id < test_scores.length; course_id++){
            for(int test_id=0; test_id < test_scores[course_id].length; test_id++){
                while(true) {
                    try {
                        System.out.print("What was your grade on test " + (test_id+1) + " for course " + (course_id+1) + "? ");
                        test_scores[course_id][test_id] = scan.nextDouble();
                        break;
                    }
                    catch(InputMismatchException e) {
                        System.out.println("You must enter an number");
                        scan.nextLine();
                    }
                }
            }
            System.out.println(); // blank line to separate courses
        }
        scan.close();
    }
}

/* OUTPUT

How many courses are you taking? five
You must enter an integer
How many courses are you taking? -5
You must enter a positive number
How many courses are you taking? 3.4
You must enter an integer
How many courses are you taking? 2
How many tests are in course number 1? three
You must enter an integer
How many tests are in course number 1? 1.5
You must enter an integer
How many tests are in course number 1? -2
You must enter a positive number
How many tests are in course number 1? 2
How many tests are in course number 2? 3
What was your grade on test 1 for course 1? ninety
You must enter an number
What was your grade on test 1 for course 1? 90
What was your grade on test 2 for course 1? 91.5

What was your grade on test 1 for course 2? 88.8
What was your grade on test 2 for course 2? 77
What was your grade on test 3 for course 2? 99.9

*/