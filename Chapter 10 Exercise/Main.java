/* 
Ex10RandomPointsStarter
CS 111B Starter Program for Exercise for Chapter 10

Written by Ye Htut Oo
Your job is to write the loop condition and
function body to complete the program below.

The function should generate random (x,y)
coordinates between 1-10, and return a Point object 
with those coordinates.
This program randomly generates locations for 
two players, repeating until one of their 
coordinates are the same for both players.
*/

import java.awt.Point;
import java.util.Random;

class Main 
{
    public static void main(String[] args) 
    {
        Point player1_location, player2_location;

        System.out.println("This program randomly generates (x,y) locations");
        System.out.println("between 1-10 for two players, repeating until");
        System.out.println("one of their coordinates are the same for both players.");
        do
        {
            player1_location = randomNewPlayerLocation();
            player2_location = randomNewPlayerLocation(); 

            System.out.println("Player1 location: (" + player1_location.x 
                                +"," + player1_location.y + ")");
            System.out.println("Player2 location: (" + player2_location.x
                                +"," + player2_location.y + ")");
            System.out.println();

        // DON'T CHANGE ANY OF THE ABOVE CODE
        } while((player1_location.x != player2_location.x) && (player1_location.y != player2_location.y));

    }

    // Generates random (x,y) coordinates between 1-10, then
    // returns a Point object with those coordinates.
    static Point randomNewPlayerLocation()
    {
        // WRITE YOUR FUNCTION BODY HERE
        Random random = new Random();
        int x = random.nextInt(10) + 1;
        int y = random.nextInt(10) + 1;

        return new Point(x,y);
    }
}

/* Sample output:

This program randomly generates (x,y) locations
between 1-10 for two players, repeating until
one of their coordinates are the same for both players.
Player1 location: (6,6)
Player2 location: (10,4)

Player1 location: (4,6)
Player2 location: (3,8)

Player1 location: (6,1)
Player2 location: (7,7)

Player1 location: (5,7)
Player2 location: (8,5)

Player1 location: (7,2)
Player2 location: (2,10)

Player1 location: (5,1)
Player2 location: (1,10)

Player1 location: (7,3)
Player2 location: (9,3)

This program randomly generates (x,y) locations
between 1-10 for two players, repeating until
one of their coordinates are the same for both players.
Player1 location: (1,9)
Player2 location: (7,4)

Player1 location: (8,10)
Player2 location: (5,8)

Player1 location: (10,4)
Player2 location: (10,4)
*/