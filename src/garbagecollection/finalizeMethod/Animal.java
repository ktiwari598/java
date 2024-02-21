package garbagecollection.finalizeMethod;

public class Animal {
    private String body;

    public Animal(String body) {
        this.body = body;
        System.out.println(body + " object is created");
    }

    /**
     * This method will run when GC is going to do garbage collection for the object of this class
     *
     * It's important to note that finalize() method is not guaranteed to be called promptly or at all by the
     * garbage collector. It is generally not recommended to rely on finalize() for resource cleanup or other critical
     * tasks because its execution timing is not deterministic. Instead, it's better to use explicit resource
     * management techniques like try-with-resources or implement your own cleanup methods.
     */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is going to be deleted");
    }
}
