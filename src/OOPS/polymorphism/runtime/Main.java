package OOPS.polymorphism.runtime;

/**
 * See how the JVM is deciding at the runtime which class makeSound method to invoke based on the type of the Object
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound();

        Animal animal1 = new Cat();
        animal1.makeSound();

    }
}
