/**
 * YE HTUT OO
 */

/* File I/O Exercise for CS 111B

   From the computer and mathematical occupations in EmploymentDataSF_2020.csv, which occupation has the most workers, and what is their mean annual wage? 
   Print that on the screen.

   Also, save to a separate file: the header line and all data for occupations with more than 10,000 workers.

   Please write your program below to do all of the above.
   Your program should work even if the data in the file were different. So don't assume that most common computer occupation in SF is Software developers. 
   Write your program to look at the data to figure this out.

   The code below is meant to help you get started, but
   PLEASE CHANGE THIS CODE AS MUCH AS YOU WANT, TO MAKE IT WORK FOR YOU.
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        Scanner in_file;
        PrintWriter out_file;
        String out_file_name;
        String head_data;
        String line_in; // To store one line at a time from the file
        String[] line_data; // To store an array of data from one line of the file
        

        System.out.println("Welcome to the Employment Data Analyzer.");


        try
        {
            // Set up file input reader and open file:
            in_file = new Scanner(new File("EmploymentDataSF_2020.csv"));  
            // input the first (header) line from the file.  
            head_data = in_file.nextLine(); 
            // split on commas, put individual values into lineData array:
            line_data = head_data.split(","); 

            if (line_data.length < 5) {
                // closing Scanners before exiting the program.
                in_file.close();
                scan.close();
                throw new Exception("5 values should be in each line, separated by commas.");
            }
        }
        catch(IOException e)
        {  // handle file i/o errors:
            System.out.println("Unable to open file: EmploymentDataSF_2020.csv");
            System.out.println(e.getMessage());
            return; // end the program
        }
        catch(Exception e)
        {  // handle other errors:
            System.out.println("The file EmploymentDataSF_2020.csv isn't in the right format:");
            System.out.println(e.getMessage() + "\nOutput file is probably incomplete.");
            return; // end the program
        }


        while (true) {
            try {
                System.out.println("Enter name of output file to create:");
                out_file_name = scan.nextLine();

                out_file = new PrintWriter(new File(out_file_name));
                break;
            }
            catch(IOException e) {
                System.out.println("Unable to open file: trash/trash");
                System.out.println(e.getMessage());
            }
        }

        ArrayList<String[]> employment_data = new ArrayList<>();
        int max_employment = 0;
        int employment;

        out_file.write(head_data);
        out_file.write("\n");

        while (in_file.hasNextLine()) {
            // input the line from the file.  
            line_in = in_file.nextLine(); 
            // split on commas, put individual values into lineData array:
            line_data = line_in.split(","); 

            employment = Integer.parseInt(line_data[1]);

            if (employment > 10000) {
                employment_data.add(line_data);
                out_file.write(line_in);
                out_file.write("\n");
            }
        }

        String occupation = "";
        int mean_wage = 0;

        for (String[] data : employment_data) {
            employment = Integer.parseInt(data[1]);
            if (employment > max_employment) {
                max_employment = employment;
                occupation = data[0];
                mean_wage = Integer.parseInt(data[4]);
            }
        }

        System.out.printf("The most common computer occupation in SF is '%s', with a mean annual wage of $%,3d\n", occupation, mean_wage);
        System.out.println("Data for occupations with more than 10,000 workers saved to " + out_file_name);


        in_file.close();
        out_file.close();
        scan.close();
    }
}

/*  MY OUTPUT

*****  Sample Output on Repl, hills, or other Linux
  (specifying an invalid path will throw an exception):  *****

** When EmploymentDataSF_2020.csv is not in repl Files: ** 
Welcome to the Employment Data Analyzer.
Unable to open file: EmploymentDataSF_2020.csv
EmploymentDataSF_2020.csv (No such file or directory)

** When EmploymentDataSF_2020.csv has an incomplete line: **
Welcome to the Employment Data Analyzer.
Enter name of output file to create:
popularJobs.csv
The file EmploymentDataSF_2020.csv isn't in the right format:
5 values should be in each line, separated by commas.
Output file is probably incomplete.

** When EmploymentDataSF_2020.csv is complete: **
Welcome to the Employment Data Analyzer.
Enter name of output file to create:
trash/trash 
Unable to open file: trash/trash
trash/trash (No such file or directory)
Enter name of output file to create:
popularJobs.csv
The most common computer occupation in SF is 'Software developers and software quality assurance analysts and testers', with a mean annual wage of $144,740
Data for occupations with more than 10,000 workers saved to popularJobs.csv

> cat popularJobs.csv 
Occupation,Number of workers,Location quotient,Mean Hourly Wage,Mean Annual Wage
Computer systems analysts,15450,1.6,60.27,125350
Computer user support specialists,15640,1.5,37.82,78670
Software developers and software quality assurance analysts and testers,64310,2.6,69.59,144740
Computer occupations (all other),21270,3.5,60.33,125480

*/
