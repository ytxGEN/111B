/**
 * @author Zennith(Ye Htut Oo)
 * Class: CS 111B
 * Programming Exercise for Chapter 5: Electric Bicycle Criteria
 * 
 * This program inputs the specs of an electric bicycle, 
 * then output if it is a good choice, or what might be wrong with it.
 */
import java.util.Scanner;

public class Main {

    /*
     * Main method inputs specs of the electric bicycle and
     * call evaluate_bike() method to evaluate the bike.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int cost, weight, battery;

        System.out.println("I'm going to help you choose an electric bicycle.");
        System.out.println("Please enter the following for a bike model:");

        System.out.print("How much does it cost?: ");
        cost = scan.nextInt();

        System.out.print("How much does it weigh in pounds?: ");
        weight = scan.nextInt();

        System.out.print("How many watt hours is the battery?: ");
        battery = scan.nextInt();

        scan.close();

        evaluate_bike(cost, weight, battery);

    }

    /**
     * Method for evaluating a electric bike.
     * 
     * @param cost cost of the electric bicycle
     * @param weight weight of the electric bicycle in pounds
     * @param battery battery of the electric bicycle in watt hours
     */
    public static void evaluate_bike(int cost, int weight, int battery) {
        final int MAX_PRICE = 3000;
        final int MAX_WEIGHT = 60;
        final int MIN_BATTERY = 400;

        boolean expensive, heavy, weak_battery;

        expensive = (cost > MAX_PRICE);
        heavy = (weight > MAX_WEIGHT);
        weak_battery = (battery < MIN_BATTERY);

        if (expensive) {
            System.out.println("Too expensive!");
        }

        if (heavy) {
            System.out.println("Too heavy!");
        }

        if (weak_battery) {
            System.out.println("The battery is weak");
        }

        if (!(expensive) && !(heavy) && !(weak_battery)) {
            System.out.println("That's a good one!");
        }
    }
}

/*
 * Output_1
 * 
 * I'm going to help you choose an electric bicycle.
 * Please enter the following for a bike model:
 * How much does it cost?: 2850
 * How much does it weigh in pounds?: 55
 * How many watt hours is the battery?: 400
 * That's a good one!
 * 
 * 
 * Output_2
 * 
 * I'm going to help you choose an electric bicycle.
 * Please enter the following for a bike model:
 * How much does it cost?: 3300
 * How much does it weigh in pounds?: 50
 * How many watt hours is the battery?: 450
 * Too expensive!
 * 
 * 
 * Output_3
 * 
 * I'm going to help you choose an electric bicycle.
 * Please enter the following for a bike model:
 * How much does it cost?: 2000
 * How much does it weigh in pounds?: 75
 * How many watt hours is the battery?: 300
 * Too heavy!
 * The battery is weak
 */