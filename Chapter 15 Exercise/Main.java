/* Ye Htut Oo
   Programming Exercise for Chapter 15
*/

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int numCourses, numTests;
        double[][] testScores;

        System.out.print("How many courses are you taking? ");
        numCourses = s.nextInt();

        testScores = new double[numCourses][]; 
        // allocate an array of references to 1-D arrays (rows)

        for(int i = 0; i < numCourses; i++)
        {
            System.out.print("How many tests are in course number " 
            + (i+1) + "? ");
            numTests = s.nextInt();
            // allocate this row: a 1-D array of doubles:
            testScores[i] = new double[numTests];
        }

        // allocate an array to store average test scores for each course
        double[] average_scores = new double[numCourses];

        for(int courseId=0; courseId < testScores.length; courseId++)
        {
            double total_score = 0.0;
            for(int testId=0; testId < testScores[courseId].length; testId++)
            {
                System.out.print("What was your grade on test " 
                + (testId+1) + " for course "
                + (courseId+1) + "? ");
                testScores[courseId][testId] = s.nextDouble();
                total_score += testScores[courseId][testId];
            }
            double average_score = total_score / testScores[courseId].length;
            average_scores[courseId] = average_score;
            System.out.println(); // blank line to separate courses
        }

        double highest_average = average_scores[0];
        int highest_index = -1;
        for(int courseId=0; courseId < testScores.length; courseId++)
        {
            System.out.printf("The average for course %d is %.2f\n",(courseId + 1), average_scores[courseId]);
            if (average_scores[courseId] > highest_average) {
                highest_average = average_scores[courseId];
                highest_index = courseId;
            }
        }
        System.out.println();
        System.out.printf("The highest average score is %.2f\n",average_scores[highest_index]);
        s.close();
    }
}

/* Output:

How many courses are you taking?  2
How many tests are in course number 1?  4
How many tests are in course number 2?  3
What was your grade on test 1 for course 1?  10
What was your grade on test 2 for course 1?  20
What was your grade on test 3 for course 1?  30
What was your grade on test 4 for course 1?  40

What was your grade on test 1 for course 2?  90
What was your grade on test 2 for course 2?  100
What was your grade on test 3 for course 2?  85

The average for course 1 is 25.00
The average for course 2 is 91.67

The highest average score is 91.67

--------------------------------------------------

How many courses are you taking? 5
How many tests are in course number 1? 4
How many tests are in course number 2? 2
How many tests are in course number 3? 1
How many tests are in course number 4? 3
How many tests are in course number 5? 2
What was your grade on test 1 for course 1? 80
What was your grade on test 2 for course 1? 88
What was your grade on test 3 for course 1? 92
What was your grade on test 4 for course 1? 79

What was your grade on test 1 for course 2? 78
What was your grade on test 2 for course 2? 77

What was your grade on test 1 for course 3? 81

What was your grade on test 1 for course 4? 69
What was your grade on test 2 for course 4? 75
What was your grade on test 3 for course 4? 79

What was your grade on test 1 for course 5? 90
What was your grade on test 2 for course 5? 95

The average for course 1 is 84.75
The average for course 2 is 77.50
The average for course 3 is 81.00
The average for course 4 is 74.33
The average for course 5 is 92.50

The highest average score is 92.50

*/
