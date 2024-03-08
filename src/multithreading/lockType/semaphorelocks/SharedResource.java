package multithreading.lockType.semaphorelocks;

import java.util.concurrent.Semaphore;

/**
 * Semaphore locks have special capability to permit number of threads
 */
public class SharedResource {
    private boolean isAvailable = false;
    Semaphore semaphore = new Semaphore(2);

    public void addItem() {
        try {
            semaphore.acquire();
            System.out.println("Lock acquired by thread : " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(5000);
        } catch (Exception e) {

        } finally {
            semaphore.release();
            System.out.println("Lock release by thread : " + Thread.currentThread().getName());
        }
    }
}
