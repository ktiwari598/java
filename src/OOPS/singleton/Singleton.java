package OOPS.singleton;

public class Singleton {

    //volatile keyword is used to prevent threads from caching the variable locally, and also ensures that changes made
    // to the variable by one thread is immediately visible to other threads.
    private static volatile Singleton singleton;

    //To handle reflection API access
    private Singleton() {
        if(singleton != null) {
            throw new RuntimeException("Bro! please use getInstance() method to access singleton instance");
        }
    }

    public static Singleton getInstance() {
        if(singleton == null) {
            //synchronized keyword is used to ensure only 1 thread at a time enters the block (critical code).
            synchronized (Singleton.class) {
                //Double checking is used to ensure that if multiple threads manage to pass the first check, then only first
                //thread should create the instance, not the other threads
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
