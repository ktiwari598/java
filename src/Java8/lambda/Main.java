package Java8.lambda;

import static Java8.lambda.Lambda.*;

/**
 * Java 8 brought new features
 * 1. Lambda Functions
 * 2. Stream API
 * 3. Functional Interface
 * 4. Default Method in Interface
 * 5. Method Reference
 * 6. Optional class
 * 7. DateTime API
 * 8. CompletableFuture
 */
public class Main {

    public static void main(String[] args) {
        int squareResult = square.apply(5);
        int averageResult = average.andThen(square).apply(5, 7);
        System.out.println(binaryOperator.apply(5, 7));
        System.out.println(squareResult);
        System.out.println(averageResult);
        work1.doWork(5);
        work2.doWork(2);
    }

}
