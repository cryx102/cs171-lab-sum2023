package lab4.Polymorphism;


public class Cat extends Animal {
    Cat() {
        super("cat");
    }

    @Override
    void sound() {
        System.out.println("The cat meows");
    }
}
