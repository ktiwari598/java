package multithreading.producerconsumer;

public class Client {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Thread producerThread = new Thread(()-> {
            System.out.println("Inside producer thread");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            sharedResource.addItem();
        }, "thread1");

        Thread consumerThread = new Thread(()-> {
            System.out.println("Inside consumer thread");
            sharedResource.consumeItem();
        }, "thread2");

        producerThread.start();
        consumerThread.start();
    }
}
