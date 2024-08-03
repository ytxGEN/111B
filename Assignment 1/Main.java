/**
 * Ye Htut Oo (Zenith)
 * CS 111B
 * Assignment 1
 * 
 * This program ask user for number of Muni riders and number of day surveyed,
 * and output the average Muni riders.
 */

 import java.util.Scanner;

 public class Main {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
 
         int days, riders;
         double average;
         String muni_line;
 
         System.out.println("Welcome to the Muni Ridership Calculator.");
         System.out.print("Which Muni line did you survey?: ");
         muni_line = scan.nextLine();
 
         System.out.print("How many days did you survey ridership?: ");
         days = scan.nextInt();
 
         System.out.print("How many riders did you count?: ");
         riders = scan.nextInt();
         
         scan.close();

         average = (double)riders / days;
 
         System.out.printf("According to your survey, an average of %,.2f people rode the %s per day.", average, muni_line);
 
         
     }
 }
 
 /*
  * Output 1:
  * 
  * Welcome to the Muni Ridership Calculator.
  * Which Muni line did you survey?: K-Ingleside
  * How many days did you survey ridership?: 5
  * How many riders did you count?: 123456
  * According to your survey, an average of 24,691.20 people rode the K-Ingleside per day.
  * 
  * Output 2:
  * 
  * Welcome to the Muni Ridership Calculator.
  * Which Muni line did you survey?: K-Balboa Park
  * How many days did you survey ridership?: 3
  * How many riders did you count?: 45634
  * According to your survey, an average of 15,211.33 people rode the K-Balboa Park per day.
  */