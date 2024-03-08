package multithreading.atomicoperations;

/**
 * count++ is not an atomic operation, it is basically mixture of 3 different steps, get data + add data + update data
 * If multiple threads try to access increment method simultaneously, then there can be inconsistency in the state of count
 * So we should use either synchronized keyword/ AtomicInteger, etc to avoid inconsistency
 */

public class AtomicOperations {

    private int count;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
