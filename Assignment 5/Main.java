import java.util.Scanner;

/**
 * This program gets an array of names from user,
 * then inout one name from user,
 * and delete all the occurrences of that name from the list.
 * 
 * @author Ye Htut Oo
 * class: CS 111B 
 * Assignment 5: DeleteName
 */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names;
        String nameToDelete;
        int size;
        boolean nameFound = false;

        System.out.print("How many names do you want to enter? ");
        size = Integer.parseInt(scan.nextLine());

        names = new String[size];

        // input the names from user
        for (int i = 0; i < size; i++) {
            names[i] = getName(scan);
        }

        System.out.println("Which name are you looking for?");
        nameToDelete = scan.nextLine();

        // traverse the array and search for the name to delete
        for (int i = 0; i < size; i++) {
            if (nameToDelete.equals(names[i])) {
                deleteName(names, i);
                System.out.printf("Removing %s from the array.%n", nameToDelete);

                nameFound = true;
                size--; // decrease the scope of the array to check
                i--; // check the same index again in case the names are the same because we've just swapped it!
            }
        }

        // if the name is not found
        if (!nameFound) {
            System.out.println("Name not found.");
        }

        // print out the remaining names
        System.out.println("Here are the remaining names:");
        printNames(names, size);

        scan.close(); // close Scanner
    }

    /**
     * Detele the names by swapping it with the next index
     * 
     * @param names array of names
     * @param indexToDelete index of the name to delete
     */
    public static void deleteName(String[] names, int indexToDelete) {
        for (int i = indexToDelete; i < names.length - 1; i++) {
            names[i] = names[i + 1];
        }
    }

    /**
     * Print out the names from a String array.
     * 
     * @param names array of names
     * @param size size of the array to print
     */
    public static void printNames(String[] names, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(names[i] + " ");
        }
        System.out.println();
    }

    /**
     * Get the name from user
     * 
     * @param scan passed scanner object
     * @return name entered
     */
    public static String getName(Scanner scan) {
        System.out.print("Enter a name: ");
        return scan.nextLine();
    }
}

/* Sample Outputs

How many names do you want to enter? 5
Enter a name: Mary
Enter a name: Zenith
Enter a name: Zenith
Enter a name: Mary
Enter a name: Josh
Which name are you looking for?
Zenith
Removing Zenith from the array.
Removing Zenith from the array.
Here are the remaining names:
Mary Mary Josh 


How many names do you want to enter? 3   
Enter a name: Steve
Enter a name: Toby
Enter a name: Selena
Which name are you looking for?
Dave
Name not found.
Here are the remaining names:
Steve Toby Selena 

*/