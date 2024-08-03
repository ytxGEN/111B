/**
 * YE HTUT OO
 * CLASS: CS 111B
 */
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
