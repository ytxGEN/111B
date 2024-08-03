/*
 * YE HTUT OO
 * Assignment 13
 */
public class Cat extends Animal implements Talker {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.print("Meow");
    }
}
