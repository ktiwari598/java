package multithreading.lockType.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    private static boolean isAvailable = false;

    public void addItem(ReadWriteLock lock) {
        try {
            lock.readLock().lock();
            System.out.println("Producer Thread is adding item");
            Thread.sleep(4000);
            isAvailable = true;
            notifyAll();
        } catch (Exception e) {

        } finally {
            lock.readLock().unlock();
            System.out.println("Releasing read lock by thread : " + Thread.currentThread().getName() + " isAvailable: " + isAvailable);
        }
    }

    public void consumeItem(ReadWriteLock lock) {
        try {
            lock.writeLock().lock();
            System.out.println("Acquired write lock by thread : " + Thread.currentThread().getName());
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
            lock.writeLock().unlock();
            System.out.println("Releasing write lock by thread : " + Thread.currentThread().getName() + " isAvailable: "+isAvailable);
        }
    }
}
