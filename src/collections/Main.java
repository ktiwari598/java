package collections;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Why Collection framework? ->
 * Collection - part of JCF, interface that exposes various methods which are implemented by collection classes
 * like ArrayList, Stack, etc.
 * Collections - A Utility class that provides some static methods to operate on collections like swap, sort, min, max,
 * reverse, binarysearch, rotate, etc.
 *
 * ArrayList, LinkedList, or LinkedHashSet, HashSet, HashMap -> allows to add null elements
 * Hashtable, PriorityQueue, ArrayDeque -> throw NPE if try to add null elements
 *
 */
public class Main {

    public static void main(String[] args) {

        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()) {
            int val = iterator.next();
            System.out.printf("%d ",val);
            if(val == 3) {
                iterator.remove();
            }
        }

        System.out.println();
        values.forEach(value -> System.out.printf("%d ", value));

        values.remove(0);//When primitive datatype is given, then it removes by index

        //When object is given, then it removes by the object, if same object present
        // multiple times, then first will get removed
        values.remove(Integer.valueOf(2));

        System.out.println();
        values.forEach(value -> System.out.printf("%d ", value));
    }
}

