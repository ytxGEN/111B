/**
 * @author: Zennith (Ye Htut Oo)
 * Class: CS 111B
 * Programming Exercise for Chapter 4 : Area Function
 * 
 * This program calculate the area of the rectangle based on
 * inputs, width and height,
 * and outputs the area of the rectangle.
 * 
 */

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    /**
     * Main method inputs width and height and call
     * calculateArea() method to calculate area of the rectangle
     * and outputs the resulting area.
     */
    public static void main(String[] args) {
        double width, height, area;

        System.out.print("Enter width: ");
        width = scan.nextDouble();

        System.out.print("Enter height: ");
        height = scan.nextDouble();

        area = calculateArea(width, height);

        System.out.printf("Area is: %,.1f", area);
    }

    /**
     * Method for calculating area of a rectangle
     * 
     * @param width width of the rectangle
     * @param height height of the rectangle
     * @return area of the rectangle 
     */
    public static double calculateArea(double width, double height) {
        return (width * height);
    }
}

/*
 * Sample Output 1:
 * Enter width: 5
 * Enter height: 6
 * Area is: 30.0
 * 
 * Sample Output 2:
 * Enter width: 2.5
 * Enter height: 5
 * Area is: 12.5
 */
