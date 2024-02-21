package OOPS.clone;

/**
 *  By default, the clone() method performs a shallow copy, meaning it creates a new object and copies the values of
 *  all fields from the original object to the new object. If the fields of the original object are reference types,
 *  then only the references to the objects are copied, not the actual objects themselves.
 *  As a result, changes made to the original object's fields may affect the cloned object's fields and vice versa.
 *
 *  In order to use the clone() method, the class of the object being cloned must implement the Cloneable interface
 *  This interface serves as a marker interface to indicate that the object's class supports cloning. If a class does
 *  not implement Cloneable and you attempt to call clone() on an object of that class, it will throw a
 *  CloneNotSupportedException.
 *
 *  Deep Copy: If you need to perform a deep copy, where both the object and its fields are duplicated, you need to
 *  override the clone() method and implement custom logic to create a new instance of the object
 *  and clone its fields recursively.
 */

public class Main {
    public static void main(String[] args) {
        ClassB classB = new ClassB(100);
        MyClass original = new MyClass(10, classB);
        try {
            // Clone the original object
            MyClass cloned = (MyClass) original.clone();

            // Modify the value of the original object
            original.setValue(20);
            original.getClassB().setId(2000);

            // Print values of original and cloned objects
            System.out.println("Original value: " + original.getValue() + ", class: " + original.getClassB());
            System.out.println("Cloned value: " + cloned.getValue() + ", class: " + cloned.getClassB());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
