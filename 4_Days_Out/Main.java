/**
 * Student Name: Ye Htut Oo
 * Class: CS 111B
 * Programming Exercise for Chapter 6: Days Out
 * 
 * This program calculates the average number of days missed per employee
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numEmps, totalDaysMissed;

        numEmps = getNumEmps();
        totalDaysMissed = getDayMissed(numEmps);
        showAvgDaysMissed(numEmps, totalDaysMissed);
    }

    // Method to get the number of employees with input validation
    public static int getNumEmps() {

        int val;
        Scanner scan = new Scanner(System.in);

        System.out.print("How many employees does the company have? ");

        do {
            val = Integer.parseInt(scan.nextLine());

            if (val <= 0) {
                System.out.print("The number of employees must be one or greater. Please re-enter: ");
            }

        } while (val <= 0);

        return val;

    }

    // Method to get the total days missed by all employees
    public static int getDayMissed(int numEmps) {

        Scanner scan = new Scanner(System.in);
        int totalDaysMissed = 0;
        int dayMissed = 0;

        for (int i = 1; i <= numEmps; i++) {
            System.out.printf("Days missed by employee #%d: ", i);
            do {
                
                dayMissed = Integer.parseInt(scan.nextLine());

                if (dayMissed < 0) {
                    System.out.print("Days missed must be zero or greater. Please re-enter: ");
                }

            } while (dayMissed < 0);

            totalDaysMissed += dayMissed;

        }

        return totalDaysMissed;

    }

    // Method to display the average days missed per employee
    public static void showAvgDaysMissed(int numEmps, int totalDaysMissed) {
        double average = (double) totalDaysMissed / numEmps;

        System.out.printf("The average number of days missed per employee is %.1f", average);
    }
}

/*
Output 1:

How many employees does the company have? -1
The number of employees must be one or greater. Please re-enter: 0
The number of employees must be one or greater. Please re-enter: 3
Days missed by employee #1: -1
Days missed must be zero or greater. Please re-enter: 0
Days missed by employee #2: 0
Days missed by employee #3: 3
The average number of days missed per employee is 1.0
*/

/*
Output2:

How many employees does the company have? 5
Days missed by employee #1: -3
Days missed must be zero or greater. Please re-enter: 0
Days missed by employee #2: 10
Days missed by employee #3: 3
Days missed by employee #4: 8
Days missed by employee #5: 9
The average number of days missed per employee is 6.0
*/