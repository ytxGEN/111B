/**
 * @NAME: YE HTUT OO
 */

/* Starter project for Assignment 13 File I/O for Grade Average
   CS 111B, Craig Persiko's class.  
   
   Your job is to write a program to read the grades.txt file
   in this project, to produce output like shown here.

   "grades.txt" is the file your program should read.  "badformat.txt" is an example of a file that your program can't read, so a clear error message should be generated, as shown in the sample output.
*/
import java.io.*;
import java.util.Scanner;

class Main
{
    private static final int NUM_SCORES = 4;
    // named constant for the number of scores per student in file

    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Scanner input_file = null;

        PrintWriter output_file = null;

        String input_file_name = "";
        String output_file_name = "";
        String line = "";

        String[] line_data = null;

        int[] scores = new int[NUM_SCORES];
    

        System.out.println("Welcome to the Grade Average Calculator.");

        while (true) {
            try {
                System.out.println("Please enter the name of a file to input:");
                input_file_name = keyboard.nextLine();
                
                input_file = new Scanner(new File(input_file_name));
                break;
            }
            catch (IOException e) {
                System.out.println("Unable to open file: " + input_file_name);
            }
        }

        while (true) {
            try {
                System.out.println("Enter name of output file to create:");
                output_file_name = keyboard.nextLine();
                
                output_file = new PrintWriter(new File(output_file_name));
                break;
            }
            catch (IOException e) {
                System.out.println("Unable to open file: " + output_file_name);
            }
        }

        try {
            while (input_file.hasNextLine()) {
                line = input_file.nextLine();
                line_data = line.split(" ");

                output_file.write(line_data[0] + " ");

                double average_score = 0.0;

                for (int i = 1; i < line_data.length; i++) {
                    average_score += Integer.parseInt(line_data[i]);
                }

                average_score /= scores.length;

                output_file.write(String.format("%.1f\n", average_score));
            }
        }
        catch (NumberFormatException e) {
            System.out.println("The file badformat.txt isn't in the right format:");
            System.out.println("it should have 1 name followed by 4 numbers on each line,");
            System.out.println("separated by spaces. The following error was generated:");
            System.out.println("4 scores should follow each name, with spaces in between.");
            System.out.println("Grades could not be averaged.");

            keyboard.close();
            input_file.close();
            return;
        }

        keyboard.close();
        input_file.close();

        System.out.println("Average grades saved to " + output_file_name);
        output_file.close();
       
    }
}

/* 
**** MY OUTPUT ****


Welcome to the Grade Average Calculator.
Please enter the name of a file to input:
trash
Unable to open file: trash
Please enter the name of a file to input:
grades.txt
Enter name of output file to create:
trash/trash
Unable to open file: trash/trash
Enter name of output file to create:
gradeAvg.txt
Average grades saved to gradeAvg.txt

> cat grades.txt
Biden 85 90 95 98
Trump 50 70 75 80
Obama 90 95 98 97
Bush 80 70 75 85
Clinton 90 95 85 99
Bush 85 95 90 94

> cat gradeAvg.txt
Here are the average grades:
Biden 92.0 
Trump 68.8 
Obama 95.0 
Bush 77.5 
Clinton 92.3 
Bush 91.0 

> java Main
Welcome to the Grade Average Calculator.
Please enter the name of a file to input:
badformat.txt
Enter name of output file to create:
gradeAvg.txt
The file badformat.txt isn't in the right format:
it should have 1 name followed by 4 numbers on each line,
separated by spaces. The following error was generated:
4 scores should follow each name, with spaces in between.
Grades could not be averaged.

> cat badformat.txt
Biden 85 90
Trump 50 70 75 
Obama 90 95 98 97
Bush 80 70 75 85
Clinton 90 95 85 99Bush 85 95 90 94

*/
