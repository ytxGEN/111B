/*
 * YE HTUT OO
 * Assignment 13
 */
abstract class Animal {
    protected String name;

    protected Animal(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
}

/* OUTPUT

What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? 
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Franny
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: f
What is your fish's name? Bubbles
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: c
What is your cat's name? Tiger
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: r
Do you want to enter another? Type y or n: y
What do you have? Enter 'd' for dog, 'c' for cat, 'f' for fish, or 'r' for radio: d
What is your dog's name? Jenny
Do you want to enter another? Type y or n: n
Hello Fido
Hello Franny
Hello Bubbles
Hello Tiger
Hello Jenny
Woof
Woof
Meow
blahblahblah
Woof

*/
