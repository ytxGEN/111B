/**
 * Ye Htut Oo
 * 
 * Programming Exercise for Chapter 14
 */
import java.util.Scanner;

public class HourlyEmployee extends Employee{
    protected double hourlyRate;
    protected double expectedHoursPerWeek;
    private static final Scanner SCAN = new Scanner(System.in);

    // Default constructor
    public HourlyEmployee() {

        hourlyRate = 0.0;
        expectedHoursPerWeek = 0.0;

    }

    // Paramterized constructor
    public HourlyEmployee(String first, String last, String socSecNum,
    String country, double hourlyRate, double expectedHoursPerWeek) {

        super(first, last, socSecNum, country);
        this.hourlyRate = hourlyRate;
        this.expectedHoursPerWeek = expectedHoursPerWeek;

    }

    // Overriding input method to get user input
    @Override
    public void input() {

        super.input();

        System.out.print("Please enter hourly rate: ");
        String input = SCAN.nextLine();
        hourlyRate = Double.parseDouble(input.substring(input.indexOf("$") + 1));

        System.out.print("Please enter expected hours per week: ");
        expectedHoursPerWeek = SCAN.nextDouble();
    }

    // Overriding output method to display employee information
    @Override
    public void output() {
        super.output();
        System.out.println("Expected hours per week: " + expectedHoursPerWeek);
    }

    // Method to calculate weekly pay
    public double weeksPay() {
        return hourlyRate * expectedHoursPerWeek;
    }

    // Getter method for expected hours per week
    public double getHoursPerWeek() {
        return expectedHoursPerWeek;
    }

    // Setter method for expected hours per week
    public void setHoursPerWeek(double expectedHoursPerWeek){
        this.expectedHoursPerWeek = expectedHoursPerWeek;
    }

}

/*
Output
------

This program allows you to enter info about people.
Is person #1 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') h
Please enter first name: Ed
Please enter last name: Sheeran
Please enter Social Security Number: 123-45-6789
Please enter country of citizenship: UK
Please enter hourly rate: $100
Please enter expected hours per week: 30
Good morning, Ed Sheeran
Your weekly pay is $3000.0
If you worked 40 hours per week, your weekly pay would be $4000.0
Is person #2 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') s
Please enter first name: Zennith
Please enter last name: Oo
Please enter Social Security Number: 111-11-1111
Please enter country of citizenship: USA
Please enter salary: 100000
Good morning, Zennith Oo
Your salary is $8333.333333333334 per month.
Is person #3 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) y
Is this person on salary, hourly, or neither? (Enter 's', 'h', or 'n') n
Please enter first name: John
Please enter last name: Legend
Please enter Social Security Number: 222-22-2222
Please enter country of citizenship: USA
Good morning, John Legend
Is person #4 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) n
Please enter first name: Steven
Please enter last name: Chou
Good morning, Steven Chou
Is person #5 an employee? (Enter 'y' for Yes, 'n' for No, or 'q' to stop entering employees) q
Here are all the people:
1               Ed              Sheeran         123-45-6789             UK
Expected hours per week: 30.0
2               Zennith         Oo              111-11-1111             USA
3               John            Legend          222-22-2222             USA
4               Steven          Chou

*/
