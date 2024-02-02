package multithreading;

public class Thread1 extends Thread {

    public Thread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Inside " + Thread.currentThread() + i);
        }
    }
}
