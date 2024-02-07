package multithreading;

//This class depicts how stackTop variable is a shared resource and how it gets destroyed by push and pop
// operation simultaneously
public class Stack {
    private int[] array;
    private int stackTop;
    final Object lock;

    public Stack(int capacity) {
        array = new int[capacity];
        stackTop = -1;
        lock = new Object();
    }

    /**
     * Synchronized blocks can use lock of any Object
     * Synchronised methods internally uses synchronised block with the lock being 'this' object
     * If method is static, then use ClassName.class as lock just as we use in SIngleton class
     * Static synchronised methods internally use synchronised block with Classname.class as lock
     * Synchronization on static methods of a class is independent from synchronization of instance methods on objects
     * of class
     *
     * Race Condition - When 2 or more threads simultaneously updates the same value, as a consequence leaves the shared
     * value in an undefined or inconsistent state
     *
     * yield method basically is an advisory method which suggests JVM to push the current thread to Ready to Run state
     *
     * Thread scheduler ->
     * Preemptive scheduling - when high priority thread comes, then low priority thread will be
     * put to ready to run state and high priority thread will go to running state
     * Round Robin Scheduling - Schedule the threads in a round-robin fashion
     */
    public boolean push(int element) throws InterruptedException {
        synchronized (lock) {
            System.out.println("thread : " + Thread.currentThread());
            if (isFull()) return false;
            ++stackTop;
            Thread.sleep(1000);
            array[stackTop] = element;
            return true;
        }
    }

    private boolean isFull() {
        return stackTop == array.length;
    }

    public int pop() throws InterruptedException {
        synchronized (lock) {
            System.out.println("thread : " + Thread.currentThread());
            if(isEmpty()) return Integer.MIN_VALUE;
            int obj = array[stackTop];
            array[stackTop] = Integer.MIN_VALUE;
            Thread.sleep(1000);
            stackTop--;
            return obj;
        }
    }

    private boolean isEmpty() {
        return stackTop == -1;
    }
}
