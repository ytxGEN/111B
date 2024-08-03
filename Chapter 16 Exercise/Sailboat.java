/**
 * YE HTUT OO
 * CLASS: CS 111B
 */

public class Sailboat extends Vehicle {
    public Sailboat(String make, String model) {
        super(make, model);
    }

    @Override
    public boolean travel(int distance) {
        System.out.println("Wee!");
        return true;
    }
}
