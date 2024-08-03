/**
 * Ye Htut Oo
 * 
 * Assignment 9
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
    private ArrayList<Time> schedule;
    private static final Scanner SCAN = new Scanner(System.in);

    // Constructor for the Schedule class.
    // Prompts the user to enter meeting times until 'end' is entered
    public Schedule() {
        schedule = new ArrayList<Time>();

        System.out.println("Please enter the time for each meeting in hh:mm format, ");
        System.out.println("on a separate line, and type 'end' on the final line to finish.");

        String input;

        while (true) {
            input = SCAN.nextLine();
            if (input.equals("end")) {
                break;
            }
            schedule.add(new Time(input));
        }
    }

    // Returns the string representation
    @Override
    public String toString() {
        // Create StringBuilder for memory efficient string concatanation
        StringBuilder s = new StringBuilder();

        for (Time meeting : schedule) {
            s.append(meeting.toString());
            s.append("\n");
        }

        return s.toString();
    }

    // Use Selection Sort Algorithm to sort the schedule
    public void sort() {
        for (int i = 0; i < schedule.size() - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < schedule.size(); j++) {
                if (schedule.get(min_index).compareTo(schedule.get(j)) > 0) {
                    min_index = j;
                }
            }

            Time temp_i = schedule.get(i);
            Time temp_min = schedule.get(min_index);

            schedule.set(i, temp_min);
            schedule.set(min_index, temp_i);

        }
    }
}

/*
MY OUTPUT
---------

Please enter the time for each meeting in hh:mm format, 
on a separate line, and type 'end' on the final line to finish.
19:45
12:30
8:50
15:30
16:00
end
Here is your schedule, sorted in order:
08:50
12:30
15:30
16:00
19:45

-------------------------------------------

Please enter the time for each meeting in hh:mm format, 
on a separate line, and type 'end' on the final line to finish.
17:00
15:00
13:00
11:00
end
Here is your schedule, sorted in order:
11:00
13:00
15:00
17:00

*/
