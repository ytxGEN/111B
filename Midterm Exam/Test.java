import java.util.Scanner;

public class Test {
    /* Craig Persiko - CS 111B Demo program
MidtermFeedbackClarificationOfEquals
Shows == vs .equals
to clarify the midterm test question.
*/

  public static void main(String[] args) 
  {
    Scanner scan = new Scanner(System.in);
    String inputLine = scan.nextLine();
    //inputLine = inputLine + "word";
    if(inputLine == "password")
      System.out.println("The == operator returned true");
    if(inputLine.equals("password"))
      System.out.println("The .equals method returned true");
  }
}
