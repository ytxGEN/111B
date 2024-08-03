/**
 * Student Name: Ye Htut Oo
 * Class: CS 111B
 * Programming Assignment 3: Writing Methods
 * 
 * This program simulates the rock, paper scissors game.
 */
import java.util.Random;
import java.util.Scanner;

public class Main {
    // Main method to execute the game
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String gameResult;
        int menuChoice;
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Welcome to Rock-Paper-Scissor game.");
        System.out.println("...................................");

        // Main game loop
        // validate menu choice
        do {

            menuChoice = printMenu(scan);
            switch (menuChoice) {

                case 1:
                    gameResult = play(scan);
                    if (gameResult == "tie") {
                        break;
                    }
                    else if (gameResult == "win") {
                        userScore++;
                        break;
                    }
                    else if (gameResult == "lose") {
                        computerScore++;
                        break;
                    }
                    
                case 2:
                    scoreboard(userScore,computerScore);
                    break;
    
                case 3:
                    exit();
                    break;

            }

        } while (menuChoice != 3);

        scan.close(); // Scanner close

    }

    // method for printing exit message
    public static void exit() {

        System.out.println("Exiting...");

    }

    // method for printing scoreboard
    public static void scoreboard(int userScore, int computerScore) {

        System.out.printf("%nScorebord%nUser: %d%nComputer: %d%n%n", userScore, computerScore);

    }

    // method to print menu and get user choice
    public static int printMenu(Scanner scan) {

        int val;

        System.out.println("1. Play");
        System.out.println("2. Scorebord");
        System.out.println("3. Exit");
        System.out.println();

        while (true) {

            System.out.print("Enter: ");
            val = scan.nextInt();
            scan.nextLine(); // dispose of new line character

            switch (val) {

                case 1: case 2: case 3:
                    return val;
        
                default:
                    System.out.println("Invalid input. Please enter again");
                    System.out.println();

            }

        }
        
    }
    
    // method to play the game
    public static String play(Scanner scan) {

        String userchoice = getUserChoice(scan);
        String computerchoice = generateComputerChoice();

        displayChoice(userchoice, computerchoice);
        return determineWinner(userchoice, computerchoice);

    }

    // method to display the user and computer choice
    public static void displayChoice(String user_choice, String computer_choice) {

        System.out.printf("You choose: %s%n", user_choice);
        System.out.printf("Computer choose: %s%n", computer_choice);

    }

    // method to determine the winner of the game
    public static String determineWinner(String userChoice, String computerChoice) {

        boolean playerWin = ((userChoice.equals("rock") && computerChoice.equals("scissors")) || 
        (userChoice.equals("paper") && computerChoice.equals("rock")) || 
        (userChoice.equals("scissors") && computerChoice.equals("paper")));

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie !");
            return "tie";
        }
        
        else if (playerWin) {
            System.out.println("You win!");
            return "win";
        }

        else {
            System.out.println("Computer wins! Ha Ha loser...");
            return "lose";
        }
    }

    // method to get user  choice
    public static String getUserChoice(Scanner scan) {

        String userChoice;

        // validate user input for rock, paper and scissors
        while (true) {
            System.out.print("What's your choice?(rock, paper or scissors): ");
            userChoice = scan.nextLine();
            userChoice = userChoice.toLowerCase();

            switch (userChoice) {
                case "rock": case "paper": case "scissors":
                    return userChoice;
            
                default:
                    System.out.println("Invalid choice.(Enter rock, paper or scissors.)");;
            }
        }

    }

    // method to generate computer choice
    public static String generateComputerChoice() {

        String[] choice = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choice.length);

        return choice[index];

    }
}

/*
Output 1:
Welcome to Rock-Paper-Scissor game.
...................................
1. Play
2. Scorebord
3. Exit

Enter: 0
Invalid input. Please enter again

Enter: -1
Invalid input. Please enter again

Enter: 9
Invalid input. Please enter again

Enter: 3
Exiting...
*/

/*
Output 2:
Welcome to Rock-Paper-Scissor game.
...................................
1. Play
2. Scorebord
3. Exit

Enter: 1
What's your choice?: PaPer
You choose: paper
Computer choose: paper
It's a tie !
1. Play
2. Scorebord
3. Exit

Enter: 1
What's your choice?: Rock
You choose: rock
Computer choose: sicssors
Computer wins! Ha Ha loser...
1. Play
2. Scorebord
3. Exit

Enter: 3
Exiting...
*/


/*
Output 3:
Welcome to Rock-Paper-Scissor game.
...................................
1. Play
2. Scorebord
3. Exit

Enter: 1
What's your choice?: blank
Invalid choice.(Enter rock, paper or scissors.)
What's your choice?: Rockk
Invalid choice.(Enter rock, paper or scissors.)
What's your choice?: 1
Invalid choice.(Enter rock, paper or scissors.)
What's your choice?: rock
You choose: rock
Computer choose: rock
It's a tie !
1. Play
2. Scorebord
3. Exit

Enter: 3
Exiting...
*/