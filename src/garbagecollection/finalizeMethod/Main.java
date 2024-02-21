package garbagecollection.finalizeMethod;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Dog");
        animal = null;
        System.gc();
        Animal animal1 = new Animal("Cat");
        System.gc();
    }
}
