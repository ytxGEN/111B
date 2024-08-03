/* Scrabble test file for Chapter 12 Exercise
   CS 111B - Craig Persiko
   This main function tests the Tile class
   which you are supposed to modify from the 
   version we wrote for the Chapter 11 exercise.
   
   PLEASE MODIFY THIS FILE WHERE COMMENTED
   BELOW, where it says, "WRITE YOUR CODE HERE"
   AND ALSO MODIFY THE Tile.java FILE,
   TO PRODUCE THE OUTPUT SHOWN AT BOTTOM.
*/

/**
 * Programming Exercise for Chapter 12
 * 
 * @author Ye Htut Oo
 */

class Main 
{
    public static void main(String[] args) 
    {
        Tile[] word = new Tile[7];
        Tile bestTile;
        int totalValue = 0;

        word[0] = new Tile('B', 3);
        word[1] = new Tile('I', 1);
        word[2] = new Tile('C', 3);
        word[3] = new Tile('Y', 4);
        word[4] = new Tile('C', 3);
        word[5] = new Tile('L', 1);
        word[6] = new Tile('E', 1);

        bestTile = word[0]; // starting point for comparison
        System.out.print("The word ");

        for(Tile t : word)  // for each Tile in the word
        {
            // add each Tile's value to totalValue:
            // WRITE YOUR CODE HERE
            totalValue += t.getValue();

            // print each letter in the word:
            // WRITE YOUR CODE HERE
            System.out.print(t.getLetter());

            // store the highest-value Tile in bestTile, using .compareTo:
            // WRITE YOUR CODE HERE
            if (t.compareTo(bestTile) > 0) {
                bestTile = t;
            }

        }
        System.out.println(" is worth " + totalValue + " points");

        System.out.println("Its tile with the highest value is:");
        System.out.println(bestTile);

        System.out.println("You have used a total of " 
                            + Tile.getTileCount() + " tiles so far.");
    }
}

/* When this project is completed,
   it should produce the output shown below:

The word BICYCLE is worth 16 points
Its tile with the highest value is:
Y with value: 4
You have used a total of 7 tiles so far.

*/

/* My Output

The word BICYCLE is worth 16 points
Its tile with the highest value is:
Y with value: 4
You have used a total of 7 tiles so far.

 */