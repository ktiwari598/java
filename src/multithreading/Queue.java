package multithreading;

public class Queue extends Stack {

    public Queue(int capacity) {
        super(capacity);
    }

    //Child class can either choose to synchronise the parent method or not.

    @Override
    public boolean push(int element) throws InterruptedException {
        return super.push(element);
    }

    @Override
    public int pop() throws InterruptedException {
        return super.pop();
    }
}
