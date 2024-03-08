package multithreading.lockType.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * Here we don't use the synchronized keyword because the calling objects are different, so lock will be different
 * and it won't be able to prevent the threads from accessing the critical section one at a time.
 * So when objects are different and we want the critical section code to be accessed one at a time, we can use
 * Reentrant lock
 */
public class SharedResource {
    private boolean isAvailable = false;
    ReentrantLock reentrantLock = new ReentrantLock();

    public void addItem() {
        try {
            reentrantLock.lock();
            System.out.println("Producer Thread is adding item");
            isAvailable = true;
            notifyAll();
        } catch (Exception e) {

        } finally {
            reentrantLock.unlock();
        }
    }

    public void consumeItem() {
        try {
            reentrantLock.lock();
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
        } catch (Exception e) {

        } finally {
            reentrantLock.unlock();
        }
    }
}
