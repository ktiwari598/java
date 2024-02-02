package multithreading;

/**
 * Thread created using Runnable interface is more preferable compare to thread created using extension of Thread class
 * because when you extend Thread class, now that class can't extend any more class as java do not support multiple
 * inheritance, but when you use runnable interface implementation, then you can definitely extend other
 * classes and also implement other interfaces
 * So creating thread using Thread class extension brings constraints for the child class
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Inside Main thread ");

        Thread1 thread1 = new Thread1("Masala");
        //thread1.setDaemon(true);
        thread1.start();

        Thread thread2 = new Thread(new Thread2(), "kosmos");
        thread2.start();

        //Instead of creating a new class which implements Runnable, you can also use lambda functions
        Thread thread3 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Inside " + Thread.currentThread() + i);
            }
        }, "zingora");
        thread3.start();

        System.out.println("Exiting main thread");
    }
}
