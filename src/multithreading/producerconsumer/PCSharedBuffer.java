package multithreading.producerconsumer;

public class PCSharedBuffer {

    private int curIndex = -1;
    private int capacity;

    int[] buffer;

    public PCSharedBuffer(int size) {
        buffer = new int[size];
        capacity = size;
    }

    public synchronized void addItem(int newItem) {
        System.out.println("Inside addItem method");
        if(curIndex+1 == capacity) {
            try {
                System.out.println("Buffer size is full, waiting for consumer to consume some item");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Producing new item " + newItem);
        buffer[curIndex+1] = newItem;
        curIndex++;
        notifyAll();
    }

    public synchronized int consumeItem() {
        System.out.println("Inside consumeItem method");
        if(curIndex < 0) {
            try {
                System.out.println("Buffer is empty!, waiting for producer to produce some item");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int result = buffer[curIndex];
        curIndex--;
        System.out.println("Consumed item is " + result);
        notifyAll();
        return result;
    }

}
