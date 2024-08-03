/**
 * YE HTUT OO
 * CLASS: CS 111B
 */
public class ElectricCar extends Vehicle implements LimitedRange {
    private int range;

    public ElectricCar(String make, String model, int range) {
        super(make, model);
        this.range = range;
    }
    
    @Override
    public int getCurrentRange() {
        return range;
    }

    @Override
    public boolean travel(int distance) {
        if (distance < range) {
            System.out.println("Zoom!");
            range -= distance;
            return true;
        }

        return false;
    }
}

public class Motorboat extends Vehicle implements LimitedRange {
    private int range;

    public Motorboat(String make, String model, int range) {
        super(make, model);
        this.range = range;
    }

    @Override
    public int getCurrentRange() {
        return range;
    }

    @Override
    public boolean travel(int distance) {
        if (distance < range) {
            System.out.println("Wissßhhh!");
            range -= distance;
            return true;
        }

        return false;
    }

}

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

/* OUTPUT:

Going 20 miles: Zoom!
I can go 242 miles farther.
Going 40 miles: Zoom!
I can go 202 miles farther.

Going 20 miles: Wisshhh!
I can go 25 miles farther.
Going 40 miles: Can't make it.

Going 20 miles: Weee!
Going 40 miles: Weee!

*/