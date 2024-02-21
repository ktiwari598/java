package exceptionhandling.finallyblock;

public class Main {

    /**
     * In summary, while the finally block is intended to always execute, it can be stopped from executing if the
     * program exits abruptly using System.exit() or if there's an endless loop preventing the completion of the try block
     *
     * Used to release resources, close connections, or perform cleanup tasks, even if an exception is thrown.
     */
    public static void main(String[] args) {
        try {
            // Code that may throw an exception
            int result = 10 / 0;
            // This line will not execute because the program will exit
            System.out.println("This line will not be reached.");
            // This line will terminate the JVM, skipping the finally block
        } catch (ArithmeticException e) {
            // Handling the exception
            System.out.println("Error: " + e.getMessage());
            System.exit(0);
        } finally {
            // Code that must always execute
            System.out.println("Finally block executed.");
        }
    }
}
