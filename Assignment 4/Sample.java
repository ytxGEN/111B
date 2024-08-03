/* Van Ness, Lin   CS 111B
Programming Exercise for Chapter 7
This program allows the user to input multiple names, displays them in reverse order, and identifies the longest name among them
*/
import java.util.Scanner;
public class Sample {
  public static void main(String[] args) {
    Scanner keyIn = new Scanner(System.in);
    String[] names = getNames(keyIn);
    printNamesInReverse(names);
  }
  // getNames method, a method that asks the user to input a number and names. Loop to input names. return names.
  public static String[] getNames(Scanner keyIn) {
    System.out.print("How many name do you want to enter? ");
    int numNames = keyIn.nextInt();
    keyIn.nextLine();
    String[] names = new String[numNames];
    
    for (int i = 0; i < numNames; i++) {
      System.out.print("Enter a name: ");
      names[i] = keyIn.nextLine();     
    }
    return names;
  }
  // printNamesInReverse method, a method that prints the names in reverse order.
  public static void printNamesInReverse(String[] names) { 
    System.out.println("Here are the names you entered, in reverse order: ");
    for (int i = names.length - 1; i >= 0; i--){
      System.out.println(names[i]);
    }
   // find the longest name that user input.
    String longestName = names[0];
    for (int i = 1; i < names.length; i++) {
      if (names[i].length() >= longestName.length()) {
        longestName = names[i];
      }
    }
    System.out.println("Here is the logest name, with " + longestName.length() + " characters: ");
      System.out.print(longestName);
    
  }
}