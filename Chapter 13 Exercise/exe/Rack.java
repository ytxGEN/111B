package exe;
/**
 * Name : Ye Htut Oo
 */

/*
Rack.java by Craig Persiko
Starter file for Exercise for Chapter 13 in CS 111B

This class stores an ArrayList of Tile objects,
sorts them, and returns them via .toString()

DO NOT CHANGE THE FOLLOWING CODE.
YOUR JOB IS TO ADD THE FOLLOWING METHODS:
.toString()
.sortHighToLow() 
You may also add any helper methods you want,
such as swapValues.
Make sure to write the Selection Sort algorithm like
in the class example, but using the Tile object's 
.compareTo method. You can copy my code from my 
example, and then change it to fit your program. Note 
that we want to sort Tiles from highest value to 
lowest (the opposite order from our example.)
*/

import java.util.ArrayList;

class Rack
{
    private ArrayList<Tile> tiles;

    public Rack()
    {
        tiles = new ArrayList<Tile>();
    }

    public void addTile(Tile t)
    {
        tiles.add(t);
    }

    /*
    DO NOT CHANGE THE ABOVE CODE.
    YOUR JOB IS TO ADD THE FOLLOWING METHODS:
    .toString()
    .sortHighToLow()
    You may also add any helper methods you want,
    such as swapValues.
    Make sure to write the Selection Sort algorithm like
    in the class example, but using the Tile object's 
    .compareTo method. You can copy my code from my 
    example, and then change it to fit your program. Note 
    that we want to sort Tiles from highest value to 
    lowest (the opposite order from our example.)
    */

    @Override
    public String toString() {
        // Create a StringBuilder to make memory efficient String concatenations 
        StringBuilder s = new StringBuilder();

        for (Tile tile : tiles) {
            s.append(tile.getLetter());
            s.append(" ");
        }

        return s.toString();
    }

    /**
     * Selection sort the tiles in the rack from high to low order.
     */
    public void sortHighToLow() {
        int n = tiles.size();

        for (int i = 0; i < n - 1; i++) {
            int max_index = i;
            for (int j = i + 1; j < n; j++) {
                if (tiles.get(max_index).getValue() < tiles.get(j).getValue()) {
                    max_index = j;
                }
            }

            swapValues(max_index, i);
        }
    }

    /**
     * Swap the values of two tiles in the rack.
     * 
     * @param index_1 the index of the first tile
     * @param index_2 the index of the second tile
     */
    public void swapValues(int index_1, int index_2) {
        Tile temp = tiles.get(index_1);
        tiles.set(index_1, tiles.get(index_2));
        tiles.set(index_2, temp);
    }

}

/*
My Output:

Craig's rack of tiles, in order from most valuable to least:
Z H Y L O E L 
Betto's rack of tiles, in order from most valuable to least:
W D S A E T N 
*/