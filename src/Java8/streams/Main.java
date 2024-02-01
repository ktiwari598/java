package Java8.streams;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> numList = List.of(1, 2, 1, 4, 5, 2, 3, 5, 6, 7, 8, 9);

//        numList.stream()
//                .sorted()
//                .toList()
//                .forEach(System.out::println);

//        numList.stream()
//                .limit(2)
//                .peek(System.out::println)
//                .toList()
//                .forEach(System.out::println);


        //peak() and forEach() operation works similar, but peek() is an intermediate operation which means further
        // stream processing can happen, but forEach() is a terminal operation that ends the stream processing.
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        numbers.stream()
                .map(n -> n * 2)
                .peek(System.out::println) // Print each element
                .map(n -> n/2)
                .forEach(System.out::println); // Print each transformed element

        System.out.println((numbers.stream().reduce(0, Integer::sum)));

        System.out.println(numbers.stream().allMatch(x -> x%2 == 0));

        //both below operations return an Optional
        //use findAny() when order of the stream is not important, while use findFirst() when order is important
        System.out.println(numbers.stream().findAny());

        System.out.println(numbers.stream().findFirst());

    }
}
