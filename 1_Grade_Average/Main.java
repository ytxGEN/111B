/**
 * Ye Htut Oo (Zenith)
 * CS 111B
 * Chapter 1-3 Exercise
 * 
 * This program asks the user to input 3 integer grades and then uses a typecast to output the floating
 * point average to 1 digit after the decimal point.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

        int grade_1, grade_2, grade_3;
        double average;

        System.out.print("Please enter 3 integer grades(seperated by spaces): ");
        grade_1 = scan.nextInt();
        grade_2 = scan.nextInt();
        grade_3 = scan.nextInt();

        scan.close();
        
        average = (double)(grade_1 + grade_2 + grade_3) / 3;

        System.out.printf("Their average is %.1f", average);

    }
}

/*
* Output 1:
* 
* Please enter 3 integer grades(seperated by spaces): 40 34 89
* Their average is 54.3
* 
* Output 2:
* 
* Please enter 3 integer grades(seperated by spaces): 45 69 45
* Their average is 53.0
*/