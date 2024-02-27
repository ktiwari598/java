public class StackVsHeapMemory {
    /**
     * We store primitive data types, and references of objects in stack memory, while the object itself is
     * stored in heap memory
     *
     * Each thread have its own stack memory but heap memory is common for all
     *
     * String literals in java are store in string constant pool which are in heap memory, but strings
     * created with new keyword are not stored in string constant pool
     *
     * Static variables/methods - Store in the method area of heap memory
     * Local Variables - Stored in the stack memory, created and destroyed with each method invocation
     * Instance Variables - Stored in the heap memory, each associated with a reference variable in the stack memory
     *
     *
     * Garbage Collector deletes the unreferenced objects from the heap
     *
     * When stack memory is full, then throws StackOverflowError
     * When heap memory is full, then throws OutOfMemoryError
     *
     * Heap memory:
     * Young Gen,                              Old Gen,             MetaSpace(Non Heap)
     * Eden, Survivor1, Survivor2
     *
     * Mark & Sweep Algorithm in GC
     * GC first marks objects which are not referenced, then deletes them and moves them to either
     * S0 || S1 and increment their age factor, whichever is empty. At a time, one of S0 || S1 is always empty.
     *
     * When age factor reaches to a certain threshold, then we move the object from Young to Old gen, where
     * major GC happens but in a relatively much larger time compared to minor GC in young gen.
     *
     * Metaspace contains info about classes loaded by JVM, class variables, like static variables, info about classes from
     * which objects can be created.
     *
     * Garbage Collection Algorithms verison
     *
     * Note - GC task is very expensive because when GC tasks start, application threads will pause till gc completes.
     *
     * Serial GC -> Only 1 thread will do the garbage collection task
     *
     * Parallel GC -> used in java 8, parallel threads will do the gc task, but still application threads
     * will pause till gc completes.
     *
     * Concurrent Mark & Sweep -> both gc and application threads will work simultaneously, but no compaction will happen
     *
     * G1 GC -> Used in newer version of Java, is improvement over concurrent mark & sweep, also compaction happens
     *
     * finalize -> This method is invoked by GC just before deleting the unreferenced object, used for performing
     * clean up operations
     *
     * String is immutable in java because :
     * String is most commonly used as credentials, if String is mutable and somehow some hacker modifies its
     * content, then this will impact the system and cause severe security issues
     * String is used as key in many hash based collections like hashmap, hashset, So, changing the content of
     * the key will cause unwanted issues while accessing the collections.
     * String is made immutable so that String Constant Pool can be used to save a lot of heap space by sharing
     * same String literals across different reference variables
     *
     *
     * Feature	        StringBuffer	                        StringBuilder
     * Thread safety	Thread-safe (synchronized methods)	    Not thread-safe
     * Performance	    Slower due to synchronization	        Faster due to lack of synchronization
     * Introduced	    Java 1.0	                            Java 5.0
     * Use Cases	    Multithreaded environments	            Single-threaded environments
     *
     * It would seem logical to collect and store the password in an object of type java.lang.String. However,
     * here's the caveat: Objects of type String are immutable, i.e., there are no methods defined that allow you
     * to change (overwrite) or zero out the contents of a String after usage. This feature makes String objects
     * unsuitable for storing security sensitive information such as user passwords.
     * You should always collect and store security sensitive information in a char array instead.
     *
     */
}
