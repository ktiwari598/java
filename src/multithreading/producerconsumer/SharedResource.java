package multithreading.producerconsumer;

public class SharedResource {

    private boolean isAvailable = false;

    public void addItem() {
        System.out.println("Producer Thread is adding item");
        isAvailable = true;
        notifyAll();
    }

    public void consumeItem() {
        System.out.println("Inside consume Item method");
        while(!isAvailable) {
            try {
                System.out.println("Item is not available, thread is waiting!");
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Consumer Thread is consuming item");
        isAvailable = false;
    }

}
