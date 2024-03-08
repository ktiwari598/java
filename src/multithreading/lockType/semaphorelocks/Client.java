package multithreading.lockType.semaphorelocks;

public class Client {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread thread1 = new Thread(()-> {
            sharedResource.addItem();
        });
        Thread thread2 = new Thread(()-> {
            sharedResource.addItem();
        });
        Thread thread3 = new Thread(()-> {
            sharedResource.addItem();
        });
        Thread thread4 = new Thread(()-> {
            sharedResource.addItem();
        });

        thread1.start();
        thread2.start();thread3.start();thread4.start();
    }
}
