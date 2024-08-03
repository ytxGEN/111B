
/**
 * NAME: YE HTUT OO (Zennith)
 * Assignment 11 - CS 111B
 */


import java.util.Scanner;

/* 
    A class representing a Tic Tac Toe board -
    both its user interface and its logical functionality.
*/
public class TicTacBoard {
    public static final Scanner scan = new Scanner(System.in);

    private char[][] board; // 2-D array of characters
    private char curPlayer; // the player whose turn it is (X or O)

    /*
     * Variable to save the previous player before taking a turn
     */
    private char savedCurPlayer;

    /*
     * Number of moves that players have made so far
     */
    private int move_counts;

    // Constructor: board will be size x size
    public TicTacBoard() {
        board = new char[3][3];
        curPlayer = 'X'; // X gets the first move

        // initialize the board with all spaces:
        for (int r = 0; r < board.length; r++) {
            for (int c = 0; c < board[r].length; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public void playGame() {
        display();
        do
        {
            takeTurn();
            display();
        } while(!checkWinner());
    }

    ///////  display  ////////
    // Display the current status of the board on the
    // screen, using hyphens (-) for horizontal lines
    // and pipes (|) for vertical lines.
    private void display() {
        System.out.println();
        displayRow(0);
        System.out.println("-----");
        displayRow(1);
        System.out.println("-----");
        displayRow(2);
        System.out.println();
    }

    // Display the current status of row r of the board
    // on the screen, using hyphens (-) for horizontal
    // lines and pipes (|) for vertical lines.
    private void displayRow(int r) {
        System.out.println(board[r][0] + "|" + board[r][1] + "|" + board[r][2]);
    }

    ///////  takeTurn  ////////
    // Allow the curPlayer to take a turn.
    // Send output to screen saying whose turn
    // it is and specifying the format for input.
    // Read user's input and verify that it is a
    // valid move.  If it's invalid, make them
    // re-enter it.  When a valid move is entered,
    // put it on the board.
    private void takeTurn() {
        int row, col; // row and column
        boolean invalid;

        do {
            invalid = false; // assume correct entry

            System.out.println("It is now " + curPlayer + "'s turn.");
            System.out.println("Please enter your move in the form row column.");
            System.out.println("So 0 0 would be the top left, and 0 2 would be the top right.");

            row = scan.nextInt();
            col = scan.nextInt();

            if(row < 0 || col < 0 || row > 2 || col > 2)
            {
                System.out.println("Invalid entry: row and column must both be between 0 and 2 (inclusive).");
                System.out.println("Please try again.");
                invalid = true;
            }
            else if(board[row][col] != ' ')
            {
                System.out.println("Invalid entry: Row " + row + " at Column " + col
                                + " already contains: " + board[row][col]);
                System.out.println("Please try again.");
                invalid = true;
            }
        } while (invalid);

        // Now that input validation loop is finished, put the move on the board:
        board[row][col] = curPlayer;
        
        /* Keeping track of the number of moves made so far */
        move_counts++;

        /* Save the current player before taking turn */
        savedCurPlayer = curPlayer;

        // Switch to the other player (take turns):
        if(curPlayer == 'X')
            curPlayer = 'O';
        else
            curPlayer = 'X';

    }

    // If the game is over, print who won (if anyone),
    // and return true.  If the game is not over, return false.

    private boolean checkWinner() {
        // Check if there is a winner
        if (isWin()) {
            System.out.println("Player " + savedCurPlayer + " wins!");
            return true;
        }

        // Check if the game ended in a draw due to no more moves available */
        if (isOutOfMoves()) {
            System.out.println("Nobody won. Game ends in a draw.");
            return true;
        }

        // Check if there is no longer possible for anyone to win the game.
        if (move_counts >= 6 && isNotWinnable()) {
            System.out.println("Nobody can win now. Game ends in a draw.");
            return true;
        }

        return false;
    }

    /*
     * This method checks if a player has won
     */
    private boolean isWin() {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
                return true;
            }
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') ||
                (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ')) {
            return true;
        }
        return false;
    }

    /* Overloaded version
     * This method checks for winning condition in a simulated board
     * for a specified cell.
     */
    private boolean isWin(char[][]simBoard, int r, int c) {
        // Check row
        if (simBoard[r][0] == simBoard[r][1] && simBoard[r][1] == simBoard[r][2] && simBoard[r][0] != ' ') {
            return true;
        }
        // check column
        if (simBoard[0][c] == simBoard[1][c] && simBoard[1][c] == simBoard[2][c] && simBoard[0][c] != ' ') {
            return true;
        }
        // Check diagonals
        if ((simBoard[0][0] == simBoard[1][1] && simBoard[1][1] == simBoard[2][2] && simBoard[0][0] != ' ') ||
                (simBoard[0][2] == simBoard[1][1] && simBoard[1][1] == simBoard[2][0] && simBoard[0][2] != ' ')) {
            return true;
        }
        return false;
    }
    
    /*
     * Method to check if the board is out of moves
     */
    private boolean isOutOfMoves() {
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (board[r][c] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    
    /* 
        ****** EXTRA CREDIT PART ******
        If this part is used, the board can never be filled.
        Therefore, isOutOfMoves() WILL NOT WORK,
        since the program will always terminate, 
        if the game is not possible for anyone to win.
    */

    /* 
     * Method to check if the game is no longer possible to win 
     */
    private boolean isNotWinnable() {
        // Simulation board
        char[][] simBoard = new char[3][3];
        
        // Copy the current game board for simulation
        // so that the method does not affect the original board.
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                simBoard[r][c] = board[r][c];
            }
        }
        
        // Simulating moves to check if the win is possible
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                // If the cell is empty, we gonna simulate moves on the board
                if (board[r][c] == ' ') {
                    simBoard[r][c] = curPlayer;
                    
                    // * SPECIAL CONDITION *
                    // If it is the last move, and current player cannot win,
                    // IT IS NOT POSSIBLE TO WIN
                    if (!isWin(simBoard, r, c) && move_counts == 8) {
                        return true;
                    }

                    // If the current player wins with this move, return false
                    if (isWin(simBoard, r, c)) {
                        return false;
                    }

                    // If the above condition is not met,
                    // we gonna simulate a move for another player
                    if (curPlayer == 'X') {
                        simBoard[r][c] = 'O';
                    } else {
                        simBoard[r][c] = 'X';
                    }
                    if (isWin(simBoard, r, c)) {
                        return false;
                    }
                    
                    // Reset the simulated board for the next iteration
                    simBoard[r][c] = ' ';
                }
            }
        }
        
        // If we cannot simulate any winning move, it is not possible to win!
        return true;
    }
}

/* MY OUTPUT
*************
FILLED BOARD : isOutOfMove() method will only work if the extra credit part is ignored.
*************


 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| | 
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

X|O| 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X|O|X
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

X|O|X
-----
 |O| 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X|O|X
-----
 |O| 
-----
 |X| 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 0

X|O|X
-----
O|O| 
-----
 |X| 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 2

X|O|X
-----
O|O|X
-----
 |X| 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X|O|X
-----
O|O|X
-----
 |X|O

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X|O|X
-----
O|O|X
-----
X|X|O

Nobody won. Game ends in a draw.

_________________________________________________________________

*******************
EXTRA CREDIT TEST-1
*******************


 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| | 
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

X|O| 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X|O|X
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X|O|X
-----
 | | 
-----
O| | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X|O|X
-----
 | | 
-----
O|X| 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X|O|X
-----
 | | 
-----
O|X|O

Nobody can win now. Game ends in a draw.

_________________________________________________________________

*******************
EXTRA CREDIT TEST-2
*******************


 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| | 
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X| | 
-----
 | | 
-----
O| | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X| |X
-----
 | | 
-----
O| | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

X|O|X
-----
 | | 
-----
O| | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X|O|X
-----
 | | 
-----
O| |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

X|O|X
-----
 |O| 
-----
O| |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X|O|X
-----
 |O| 
-----
O|X|X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 2

X|O|X
-----
 |O|O
-----
O|X|X

Nobody can win now. Game ends in a draw.

_________________________________________________________________

***************
HORIZONTAL TEST
***************

 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| | 
-----
 | | 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

X| | 
-----
 |O| 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X| |X
-----
 |O| 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

X| |X
-----
 |O| 
-----
 | |O

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

X|X|X
-----
 |O| 
-----
 | |O

Player X wins!

_________________________________________________________________

*************
VERTICAL TEST
*************

 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

 | | 
-----
 |X| 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

O| | 
-----
 |X| 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 1

O|X| 
-----
 |X| 
-----
 | | 

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

O|X| 
-----
 |X| 
-----
 | |O

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

O|X| 
-----
 |X| 
-----
 |X|O

Player X wins!

_________________________________________________________________

*************
DIAGONAL TEST
*************

 | | 
-----
 | | 
-----
 | | 

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 2

 | | 
-----
 | | 
-----
 | |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
1 1

 | | 
-----
 |O| 
-----
 | |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 0

X| | 
-----
 |O| 
-----
 | |X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
0 2

X| |O
-----
 |O| 
-----
 | |X

It is now X's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 1

X| |O
-----
 |O| 
-----
 |X|X

It is now O's turn.
Please enter your move in the form row column.
So 0 0 would be the top left, and 0 2 would be the top right.
2 0

X| |O
-----
 |O| 
-----
O|X|X

Player O wins!

_________________________________________________________________



*/