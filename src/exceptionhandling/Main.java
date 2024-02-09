package exceptionhandling;

import java.io.IOException;

/**
 * Object -> Throwable -> Error, Exception -> Checked, Un-Checked/Runtime
 * We should not control error, as this is mostly JVM issue
 * <p>
 * Runtime exception - Arithmetic Exception, NullPointerException, IndexOutOfBoundException, NumberFormatException
 * Compile time exception - IOException, FileNotFoundException, ClassNotFoundException, SQLException
 * <p>
 * throws keyword do not handle the exception instead tells the caller method to handle the exception
 * if you explicitly catch the exception, then throws keyword is not required, else if you only have throw keyword with no catch
 * then you have to add throws keyword to method
 *
 * Compile time exception will not compile unless the exception is handled, while runtime exception will easily compile
 * and only occur at runtime
 *
 * Parent exception should always be catch after child exception
 *
 * finally block will always execute even if we return from try block
 * we can only have a single finally block, used for closing the stream, db connection, logging etc.
 * finally block will not execute if any JVM related issue like out of memory, stackoverflow error, system shutdown, etc
 *
 * Advantage of Exception handling
 * 1. For preventing abnormal termination of program
 * 2. For debugging
 * 3. Fir making code clean and concise
 *
 * Disadvantage
 * 1. If stack trace is use, then exception handling may be little expensive
 */


public class Main {
    public static void main(String[] args) {
//        method1();
    }

    private static void method1() {
        throw new NullPointerException("Null aagaya bro!");
    }

    private static void method4() {
        throw new ArithmeticException("Arithmetic aagya bro");
    }

    //CompileTimeException ko bina handle kiye compilation nhi hogi
    //isliye ya to try ctach se handle karo ya fir throws lagake parent class ko delegate kardo exception
    private static void method2() throws ClassNotFoundException {
        throw new ClassNotFoundException("Class nhi mila");
    }

    private static void method3() throws IOException {
        throw new IOException("IO aagya bro");
    }


}
