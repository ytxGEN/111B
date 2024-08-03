import java.util.Scanner;

public class Ex2 {

    public static void displayValidAge(String firstPName, boolean person1Info, String secondPName, boolean person2Info){
        if(person1Info&&person2Info){
            System.out.println("Both person are in between valid age.");
        }else if(person1Info){
            System.out.println(firstPName + " is in between valid age while " + secondPName + " " + "is not.");
        }else if(person2Info){
            System.out.println(secondPName + " is in between valid age while " + firstPName + " " + "is not.");
        }else{
            System.out.println("Both people aren't in between valid age.");
        }

    }
    public static void main(String args[]){
        String firstPName,secondPName;
        int age1, age2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the firstPName: ");
        firstPName = in.nextLine();
        System.out.println("Enter the " + firstPName + " age: ");
        age1 = Integer.parseInt(in.nextLine());
        System.out.println("Enter the secondPName: ");
        secondPName = in.nextLine();
        System.out.println("Enter the " + secondPName + " age: ");
        age2 = Integer.parseInt(in.nextLine());
        boolean person1Info = age1 >= 18 && age1 <= 65;
        boolean person2Info = age2 >= 18 && age2 <= 65;
        displayValidAge(firstPName,person1Info,secondPName,person2Info);


    }
    
}
