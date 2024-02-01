package Java8.lambda;

import java.util.Comparator;
import java.util.function.*;

/**
 * Lambda expression is a way to express instances of Functional Interface
 */
public class Lambda {

    /**
     * These are custom functional interfaces defined by me
     */
    public static A work1 = (time) -> System.out.println("Do some work bro!, time will end in " + time + "s");

    public static A work2 = (time) -> System.out.println("Do some work sis!, time will end in " + time + "s");


    /**
     * These are inbuilt functional interfaces defined in Java
     * These functional interface do not accept primitive data type, as these functions accept a generic
     * and generics in java do not support primitive data types
     */

    public static Function<Integer, Integer> square = (x) -> x * x;

    public static BiFunction<Integer, Integer, Integer> average = (x, y) -> (x + y)/2;

    //This is a special case of Function<T, R> where R = T
    public static UnaryOperator<Integer> unaryOperator = x -> x + 1;

    //This is a special case of BiFunction<T, U, R> where T = U = R
    public static BinaryOperator<Integer> binaryOperator = (x, y) -> x * 2 + y;


    public static Predicate<Integer> isOdd = x -> x%2 != 0;

    public static BiPredicate<Integer, String> biPredicate = (x, str) -> Integer.parseInt(str) == x;

    public static Consumer<String> consume = message -> System.out.println("message is : " + message);

    public static BiConsumer<String, String> biConsume = (msg1, msg2) -> System.out.println(msg1 + msg2);

    public static Supplier<String> supply = () -> "hello";

    //Here String is the type of input that you will be comparing
    public static Comparator<String> compare = (str1, str2) -> str1.length() - str2.length();

}
