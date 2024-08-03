
/**
 * @author Zennith(Ye Htut Oo)
 * Class: CS 111B
 * Programming Assignment 2: Names and Ages Program
 * 
 * This programs  inputs two people's names and ages, 
 * and then outputs if one or both people are between 18 and 65 years old.
 */

import java.util.Scanner;

public class Main {
    /**
     * Main method inputs two people's names and ages,
     * and calls determinAge() method to further processs the data.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name1, name2;
        int age1, age2;

        System.out.println("Please enter first person's name:");
        name1 = scan.nextLine();

        System.out.printf("Please enter %s\'s age:%n", name1);
        age1 = scan.nextInt();

        scan.nextLine(); // dispose new line character

        System.out.println("Please enter second person's name:");
        name2 = scan.nextLine();

        System.out.printf("Please enter %s\'s age:%n", name2);
        age2 = scan.nextInt();

        scan.close();

        determineAge(name1, name2, age1, age2);

    }

    /**
     * Method that check if the age is between 18 and 65.
     * 
     * @param age
     * @return True if in range, False if not.
     */
    public static boolean ageRangeChecker(int age) {
        return age >= 18 && age <= 65;
    }

    /**
     * Method that determine the age by calling ageRangeChecker() method,
     * and outputs the appropiate sentence.
     * 
     * @param name1
     * @param name2
     * @param age1
     * @param age2
     */
    public static void determineAge(String name1, String name2, int age1, int age2) {
        boolean person1InRange = ageRangeChecker(age1);
        boolean person2InRange = ageRangeChecker(age2);


        if (person1InRange && person2InRange) {
            System.out.println("Both people are between 18 and 65");
        }
        else if (person1InRange && !(person2InRange)) {
            System.out.printf("%s is between 18 and 65, but %s is not%n", name1, name2);
        }
        else if (!(person1InRange) && person2InRange) {
            System.out.printf("%s is between 18 and 65, but %s is not%n", name2, name1);
        }
        else {
            System.out.println("Neither person is between 18 and 65");
        }
    }

}

/* Output 1

Please enter first person's name:
Zennith
Please enter Zennith's age:
8
Please enter second person's name:
David
Please enter David's age:
5
Neither person is between 18 and 65

*/

/* Output 2

Please enter first person's name:
Zennith
Please enter Zennith's age:
18
Please enter second person's name:
David
Please enter David's age:
18
Both people are between 18 and 65

*/

/* Output 3

Please enter first person's name:
Zennith 
Please enter Zennith 's age:
19
Please enter second person's name:
David
Please enter David's age:
90
Zennith  is between 18 and 65, but David is not

*/