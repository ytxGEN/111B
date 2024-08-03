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
