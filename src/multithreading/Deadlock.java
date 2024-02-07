package multithreading;

/**
 * Deadlock is a situation when two or more threads are blocked indefinitely,
 * each waiting for a resource held by the other thread(s), thus preventing progress.
 */
public class Deadlock {
    private static final String resource1 = "A";
    private static final String resource2 = "B";

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1: Holding resource 1...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 1: Waiting for resource 2...");
                synchronized (resource2) {
                    System.out.println("Thread 1: Holding resource 1... and resource 2");
                }
            }
        }, "thread1");
        Thread thread2 = new Thread(() -> {
            synchronized (resource2) {
                System.out.println("Thread 2: Holding resource 2...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Thread 2: Waiting for resource 1...");
                synchronized (resource1) {
                    System.out.println("Thread 2: Holding resource 2... and resource 1");
                }
            }
        }, "thread1");
        thread1.start();
        thread2.start();
    }
}
