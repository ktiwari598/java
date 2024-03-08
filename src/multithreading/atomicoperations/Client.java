package multithreading.atomicoperations;

public class Client {
    public static void main(String[] args) {
        AtomicOperations atomicOperations = new AtomicOperations();

        Thread thread1 = new Thread(()-> {
            System.out.println("Starting thread1");
            for(int i=0;i<200;i++) {
                atomicOperations.increment();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread1 Count value is " + atomicOperations.getCount());
        });


        Thread thread2 = new Thread(()-> {
            System.out.println("Starting thread2");
            for(int i=0;i<200;i++) {
                atomicOperations.increment();
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("Thread2 Count value is " + atomicOperations.getCount());
        });

        thread1.start();
        thread2.start();
    }
}
