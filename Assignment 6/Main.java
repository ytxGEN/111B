/* Assign6SwapPointsStarter 
CS 111B Starter Program for Assignment 6

Written by Ye Htut Oo
Your job is to write the two missing functions
to complete the program below. DO NOT CHANGE THE MAIN METHOD.
- inputNewPlayerLocation: to input (x,y) coordinates 
from user (using Scanner), then return a Point object 
with those coordinates.
- swapPoints: to swap the coordinates of two Point 
objects. (Hint: To keep the main function's reference
variables relevant, you can't swap Point objects 
entirely. You need to change the x and y coordinates 
inside the Point objects.)

Uses a function to swap the coordinates 
stored in two Point objects, and another 
function to input coordinates and return
a Point object with those coordinates.
*/

import java.awt.Point;
import java.util.Scanner; 

class Main {
    
    private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        Point player1_location, player2_location;

        player1_location = inputNewPlayerLocation();
        player2_location = inputNewPlayerLocation(); 

        System.out.println("Player1 location: (" + player1_location.x 
                    +"," + player1_location.y + ")");
        System.out.println("Player2 location: (" + player2_location.x
                    +"," + player2_location.y + ")");

        swapPoints(player1_location, player2_location);

        System.out.println("Player 1 and Player 2 have swapped locations!");
        System.out.println("Player1 location: (" + player1_location.x 
                    +"," + player1_location.y + ")");
        System.out.println("Player2 location: (" + player2_location.x
                    +"," + player2_location.y + ")");
    }

/* DO NOT CHANGE ANY OF THE ABOVE CODE.
WRITE YOUR CODE HERE FOR THE TWO MISSING FUNCTIONS.
LOOK CLOSELY AT THE FUNCTION CALLS ABOVE TO HELP YOU 
FIGURE OUT HOW THESE MUST BE DEFINED AND WHAT THEY DO:
- inputNewPlayerLocation: to input (x,y) coordinates 
from user (using Scanner), then return a Point object 
with those coordinates.
- swapPoints: to swap the coordinates of two Point 
objects. (Hint: To keep the main function's reference
variables relevant, you can't swap Point objects 
entirely. You need to change the x and y coordinates 
inside the Point objects.)
*/
    public static Point inputNewPlayerLocation() {
        System.out.println("Welcome, new player. Please enter your coordinates:");
        System.out.print("x: ");
        int x = Integer.parseInt(scan.nextLine());
        System.out.print("y: ");
        int y = Integer.parseInt(scan.nextLine());

        return new Point(x , y);
    }

    public static void swapPoints(Point p1, Point p2) {
        int temp;
        temp = p1.x;
        p1.x = p2.x;
        p2.x = temp;

        temp = p1.y;
        p1.y = p2.y;
        p2.y = temp;
    }
}

/* Here is the Sample Output your completed program should produce:

Welcome, new player. Please enter your coordinates:
x: 5
y: 7
Welcome, new player. Please enter your coordinates:
x: 10
y: 15
Player1 location: (5,7)
Player2 location: (10,15)
Player 1 and Player 2 have swapped locations!
Player1 location: (10,15)
Player2 location: (5,7)


Welcome, new player. Please enter your coordinates:
x: 20 
y: 30
Welcome, new player. Please enter your coordinates:
x: 3
y: 1
Player1 location: (20,30)
Player2 location: (3,1)
Player 1 and Player 2 have swapped locations!
Player1 location: (3,1)
Player2 location: (20,30)

*/