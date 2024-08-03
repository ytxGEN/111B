/**
 * Programming Exercise for Chapter 11
 * Tile class to represent Scrabble Tile
 * 
 * @author Ye Htut Oo
 */
public class Tile {
    private final char letter;
    private final int value;

    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }

    // Returns the letter
    public char getLetter() {
        return this.letter;
    }

    // Returns the value
    public int getValue() {
        return this.value;
    }

    /**
     * Returns true if the other Tile has the same letter
     * and value as this Tile; otherwise returns false
     * @param other
     * @return
     */
    public boolean equals(Tile other) {
        return this.letter == other.letter 
        && this.value == other.value;
    }

    // Returns the String representation of Tile object
    public String toString() {
        return letter + " with value: " + value;
    }
}