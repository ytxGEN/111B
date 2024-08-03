/* Tile class for Chapter 12 Exercise
   CS 111B - Craig Persiko
   This Tile class represents a Scrabble tile.
   
   Beyond what we did for Chapter 11, this
   version should keep track of how many Tiles have
   been created, and define .compareTo so
   we can determine the most valuable Tile.

   ADD YOUR CODE BELOW WHERE COMMENTED IN CAPS
   TO COMPLETE THIS Tile CLASS
*/

/**
 * Programming Exercise for Chapter 12
 * 
 * @author Ye Htut Oo
 */

class Tile
{
    private char letter;
    private int value;


    // STATIC MEMBER VARIABLE DEFINITION NEEDED HERE 
    // to store the number of Tile objects that have been created (instantiated).
    // initially, we have 0 Tiles, but this will change
    private static int tileCount = 0;

    public Tile(char letter, int value)
    {
        this.letter = letter;
        this.value = value;
        // ADD YOUR CODE HERE:
        // count each Tile we instantiate
        tileCount++;
    }

    public char getLetter()
    {
        return letter;
    }

    public int getValue()
    {
        return value;
    }

    public String toString()
    {
        return letter + " with value: " + value;
    }

    // equal Tiles have the same letter and value
    public boolean equals(Tile other)
    {
        return letter == other.letter && value == other.value;
    }


    // when comparing Tiles, the value is all that matters
    // WRITE YOUR compareTo METHOD HERE
    public int compareTo(Tile other) {
        if (this.value > other.value) {
            return 1;
        }
        if (this.value < other.value) {
            return -1;
        }
        return 0;
    }

    // static member function, to 
    // return count of Tiles created
    // WRITE YOUR getTileCount FUNCTION HERE
    public static int getTileCount() {
        return tileCount;
    }

}