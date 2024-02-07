package Java8;

import java.util.Optional;
import java.util.OptionalInt;


/**
 * Optional class is a more convenient way to handle null checks, NullPointerException
 */
public class Optionals {

    public static void main(String[] args) {
        Integer val = Optional.ofNullable(10).stream()
                .reduce(0, Integer::sum);
        System.out.println(val);

        OptionalInt x = OptionalInt.of(5);
    }
}
