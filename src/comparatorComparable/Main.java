package comparatorComparable;

import java.util.*;

/**
 *
 * Unlike Comparator, Comparable is not considered a functional interface because it predates the concept of functional
 * interfaces in Java.
 * Functional interfaces were introduced in Java 8 as part of the lambda expressions feature. Comparable was not
 * retrofitted to be a functional interface to maintain backward compatibility with existing code.
 *
 * In summary, Comparator is designed to be used for custom comparison logic and provides a method that directly accepts
 * parameters for comparison, making it suitable for use with lambda expressions and functional programming constructs.
 * On the other hand, Comparable is more focused on defining natural ordering for objects and does not directly
 * provide a method for comparison, which is why it's not considered a functional interface.
 *
 * Comparator and Comparable both provides a way to sort the collection of Objects.
 *
 * Comparator
 * int compare(Obj v1, Obj v2) {
 *     if(v1 > v2) return 1; // If  1, then swap the values
 *     if(v1 == v2) return 0;
 *     return -1;
 * }
 *
 * For natural sorting, comparable is used but if you want to do some custom sorting then we cannot use Comparable,
 * we have to use Comparator and give our own implementation for the compare(Object o1, Object o2) method.
 *
 * With Comparator, we can do multiple type of sortings without changing the base class but with Comparable, we can only
 * do 1 type of sorting at a time. For different sorting, we need to change the compareTo() method in the class.
 *
 */
public class Main {

    public static void main(String[] args) {

        Integer[] arr1 = new Integer[9];
        Integer arr2[] = {4,6,3,1,7};

        Arrays.sort(arr2); //this sort implementation uses Comparable ka compareTo(int val) method
        for (Integer integer : arr2) {
            System.out.printf("%d ", integer);
        }
        System.out.println();

        //Comparator
        //1st approach using Lambda Function
        Arrays.sort(arr2, (a, b) -> b - a);// this sort implementation uses Comparator ka compare(int val1, int val2) method
        for (Integer integer : arr2) {
            System.out.printf("%d ", integer);
        }

        //Comparator using Anonymous class
        Arrays.sort(arr2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (Integer integer : arr2) {
            System.out.printf("%d ", integer);
        }

        //Comparator using class implements Comparator class
        List<Car> carsList = new ArrayList<Car>();
        carsList.add(new Car("Mercedes", "SUV"));
        carsList.add(new Car("BMW", "Sports"));
        carsList.add(new Car("Rolls Royce", "Sedan"));

        Collections.sort(carsList, new CarComparator());
    }

}
