public class StackVsHeapMemory {
    /**
     * We store primitive data types, and references of objects in stack memory, while the object itself is
     * stored in heap memory
     *
     * Each thread have its own stack memory but heap memory is common for all
     *
     * String literals in java are store in string constant pool which are in heap memory, but strings
     * created with new keyword are not stored in string constant pool
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
     * Metaspace contains info about class variables, like static variables, info about classes from
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
     */
}
