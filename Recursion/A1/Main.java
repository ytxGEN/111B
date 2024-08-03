/**
 * YE HTUT OO
 * Extra-Credit Programming Exercise for Chapter 8 Recursion
 */
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        int blocks;
        
        System.out.print("How many rows does your triangle have?: ");
        blocks = scan.nextInt();

        System.out.printf("It has %d blocks.\n", calculate_blocks(blocks));

    }

    public static int calculate_blocks(int r) {
        if (r == 0) {
            return 0;
        }
        if (r == 1) {
            return 1;
        }

        return r + calculate_blocks(r - 1);
    }
}

/* OUTPUT

How many rows does your triangle have?: 0
It has 0 blocks.

How many rows does your triangle have?: 1
It has 1 blocks.

How many rows does your triangle have?: 2
It has 3 blocks.

How many rows does your triangle have?: 3
It has 6 blocks.
*/