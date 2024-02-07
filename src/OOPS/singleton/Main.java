package OOPS.singleton;

public class Main {

    public static void main(String[] args) {
//        Singleton singleton1 = Singleton.getInstance();
//        Singleton singleton2 = Singleton.getInstance();
//        System.out.println(singleton1.hashCode() + " = " + singleton2.hashCode());

        Thread[] threads = new Thread[5];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new MyRunnable());
            threads[i].start();
        }

        // Main thread wait for all threads to finish and then finishes itself
        for (Thread thread : threads) {
            try {
                //Wait for this thread to complete or die
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished task : " + Thread.currentThread().getName());
    }
}
