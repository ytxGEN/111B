/*
 * YE HTUT OO
 * Assignment 13
 */
public class Dog extends Animal implements Talker {

    public Dog(String name) {
        super(name);
    }
    
    public Dog() {
        super("Fido");
    }

    @Override
    public void speak() {
        System.out.print("Woof");
    }
}
