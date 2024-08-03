/**
 * Programming Assignment 7: Phone Class
 * 
 * The Phone class represents a mobile phone
 * 
 * @author Ye Htut Oo
 */
public class Phone {
    private final String make; // The make of the phone
    private final String model; // The model of the phone
    private final String color; // The color of the phone
    private int capacity; // The storage capacity of the phone in gigabytes (GB)

    /**
     * Constructs a new Phone object
     * 
     * @param make
     * @param model
     * @param color
     * @param capacity
     */
    public Phone(String make, String model, String color, int capacity) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
    }

    /**
     * Sets the storage capacity of the phone.
     * 
     * @param new_capacity The new capacity of the phone in gigabytes (GB)
     */
    public void setCapacity(int new_capacity) {
        capacity = new_capacity;
    }

    /**
     * Accessor method for the make of the phone.
     * 
     * @return The make of the phone 
     */
    public String getMake() {
        return make;
    }

    /**
     * Accessor method for the model of the phone.
     * 
     * @return The model of the phone
     */
    public String getModel() {
        return model;
    }

    /**
     * Accessor method for the color of the phone.
     * 
     * @return The color of the phone
     */
    public String getColor() {
        return color;
    }

    /**
     * Accessor method for the storage capacity of the phone.
     * 
     * @return The capacity of the phone
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Returns a String representation of the Phone object.
     * 
     * @return A String representation of the Phone object
     */
    @Override
    public String toString() {
        return make + " " + model + " " + color + " with " + capacity + " GB";
    }
    
    /**
     * Check if this Phone object is equal to another Phone object.
     * 
     * @param other The other Phone object to compare
     * @return True if the two Phone objects are equals, false otherwise
     */
    // @Override
    public boolean equals(Phone other) {
        return make.equals(other.make) && 
               model.equals(other.model) &&
               color.equals(other.color) && 
               capacity == other.capacity;
    }
}

/* Sample Output

The brightest color here is: Phantom Violet
This phone:
Samsung Galaxy S21 5G Phantom Violet with 256 GB
has lower capacity than the:
Apple iPhone 13 Pro Graphite with 512 GB
We have two of these:
Apple iPhone 13 Pro Graphite with 512 GB
After upgrade they aren't equal, because this phone:
Apple iPhone 13 Pro Graphite with 1000 GB
has more capacity than:
Apple iPhone 13 Pro Graphite with 512 GB

 */
