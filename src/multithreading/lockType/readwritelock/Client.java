package multithreading.lockType.readwritelock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**                     Thread 1
 *                                              SharedLock(Read)    ExclusiveLock(Read/Write)
 *      Thread 2    SharedLock(Read)                YES                 NO
 *                  ExclusiveLock(Read/Write)       NO                  NO
 *
 * If any thread has a sharedLock, then another thread can also have a sharedLock.
 *
 * More than 1 thread can acquire the read lock
 * Only 1 thread can acquire the write lock
 */

public class Client {

    public static void main(String[] args) {
        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
        SharedResource res = new SharedResource();

        Thread thread1 = new Thread(() -> {
            res.addItem(readWriteLock);
        });

        Thread thread2 = new Thread(() -> {
            res.addItem(readWriteLock);
        });

        SharedResource res1 = new SharedResource();
        Thread thread3 = new Thread(() -> {
            res.consumeItem(readWriteLock);
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
