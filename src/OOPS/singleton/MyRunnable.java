package OOPS.singleton;

public class MyRunnable implements Runnable {

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        //synchronized (MyRunnable.class) {
            System.out.println(Thread.currentThread().getName() + ": " + singleton.hashCode());
        //}
    }
}
