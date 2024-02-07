package OOPS.polymorphism.compiletime;

public class Vehicle {

    private String name;

    public void loud() {
        System.out.println("This is lamborghini");
    }

    public void loud(String name) {
        System.out.println("This is Aston Martin");
    }

    public void loud(int x1, int x2) {
        System.out.println("This is Dusen");
    }


    public void loud(int x2, String x1) {
        System.out.println("Int and string function");
    }

    public void loud(String x1, int x2) {
        System.out.println("String and int function");
    }

    /**
     * Compile Time polymorphism (Method Overloading) works for methods with
     * different no. of input parameters
     * different type of input parameters
     * different ordering of input parameters provided the input type is not exactly same
     *
     * Compile Time polymorphism (Method Overloading) do not works for methods with
     * different return type
     * just changing the variable name with same input type
     */

}
