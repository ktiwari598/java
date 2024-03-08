package multithreading.producerconsumer;

public class PCClient {
    public static void main(String[] args) {
        PCSharedBuffer PCSharedBuffer = new PCSharedBuffer(10);

        Thread producerThread = new Thread(()-> {
            for(int i=1;i<=20;i++) {
                PCSharedBuffer.addItem(i);
            }
        }, "thread1");

        Thread consumerThread = new Thread(()-> {
            for(int i=0;i<10;i++) {
                PCSharedBuffer.consumeItem();
            }
        }, "thread1");

        consumerThread.start();
        producerThread.start();

    }
}
