package OOPS.constructor;

public class MainClass {

    public static void main(String[] args) {
        Car c1 = new Car(4, 40, "Rolls Royce");
        System.out.println(c1.getName() + " " + c1.getSeats() + " " + c1.getWheeels());

        Car c2 = new Car(c1);
        System.out.println(c2.getName() + " " + c2.getSeats() + " " + c2.getWheeels());
    }
}
