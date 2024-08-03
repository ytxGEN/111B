/* Main class to test Time class
Starter code for CS 111B Assignment 8 by Craig Persiko

This tests the Time class, which is used to store a time of day and output it.
It also store the current time of day.

Your job is to write the rest of the code where commented below.
DO NOT CHANGE ANY OF THE CODE BELOW, but add to the end of it.
*/

// NAME: Ye Htut Oo
// CS 111B
import java.util.Scanner;

class Main
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String timeString;
        int numMeetings;

        System.out.print("What time is it now? ");
        timeString = scan.nextLine();
        Time.setCurTime(timeString);

        System.out.print("Current time: ");
        Time.showCurTime();
        System.out.println();

        System.out.print("How many meetings do/did you have today? ");
        numMeetings = scan.nextInt();
        scan.nextLine(); // dispose of newline character

        // DON'T CHANGE ANY OF THE ABOVE CODE
        // WRITE YOUR CODE HERE TO PRODUCE THE OUTPUT SHOWN BELOW
        // The comments below should help you figure out the steps

        // allocate array of Time references
        // input meeting times for each meeting in a loop and
        // instantiate a Time object in the array, for each meeting
        // Output the times for the meetings that are later today
        // Determine which is the last meeting of the day,
        // and output it if it is later today.
        // Or tell the user they have no more meetings today

        Time[] meetings = new Time[numMeetings];

        int index = 1;
        for(int i = 0; i < numMeetings; i++) {
            System.out.printf("What time is meeting #%d? ", index);
            index++;
            String meeting_time = scan.nextLine();
            meetings[i] = new Time(meeting_time);
        }

        System.out.println("Here are the times for your meetings that are later today:");

        // Selection sort the array
        for (int i = 0; i < numMeetings - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < numMeetings; j++) {
                if (meetings[min_index].compareTo(meetings[j]) > 0) {
                    min_index = j;
                }
            }
            Time temp = meetings[min_index];
            meetings[min_index] = meetings[i];
            meetings[i] = temp;
        }

        boolean has_last_meeting = false;
        int last_meeting = -1;
        for (int i = 0; i < numMeetings; i++) {
            if (meetings[i].isLaterToday()) {
                System.out.println(meetings[i]);
                has_last_meeting = true;
                last_meeting = i;
            }
        }

        if (has_last_meeting) {
            System.out.println("Your last meeting of the day is at " + meetings[last_meeting]);
        }
        else {
            System.out.println("You have no more meetings today!");
        }

        // close scanner
        scan.close();
    }
}

/*

Output:

What time is it now? 15:45
Current time: 15:45
How many meetings do/did you have today? 5
What time is meeting #1? 16:00
What time is meeting #2? 16:50
What time is meeting #3? 9:00
What time is meeting #4? 10:00
What time is meeting #5? 15:00
Here are the times for your meetings that are later today:
16:00
16:50
Your last meeting of the day is at 16:50


What time is it now? 20:00
Current time: 20:00
How many meetings do/did you have today? 3
What time is meeting #1? 9:00
What time is meeting #2? 10:00
What time is meeting #3? 11:00
Here are the times for your meetings that are later today:
You have no more meetings today!


What time is it now? 8:00
Current time: 08:00
How many meetings do/did you have today? 4
What time is meeting #1? 17:00
What time is meeting #2? 15:00
What time is meeting #3? 13:00
What time is meeting #4? 11:00
Here are the times for your meetings that are later today:
11:00
13:00
15:00
17:00
Your last meeting of the day is at 17:00

*/
