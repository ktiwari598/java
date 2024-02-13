package collections;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

    /**
     * Why map is not child of Collection? -> Collection only deals with value, while map deals with key, value,
     * so methods in Collections are of no use in map, so map is not child of Collection
     *
     * Internals of HashMap
     * HashMap is basically an array of (LinkedList)Node<k,V>, Node<K,V> is implementation of Entry<K,V> sub-interface
     * Load factor prevents linked list from growing too much, e.g. hashmap size is 16, load factor is 0.75,
     * then whenever 13th key,value pair is to be inserted, then size of hashmap will be doubled and
     * re-hashing will be done for the entire hashmap
     *
     * Still, if the size of hashmap is very large, but lets suppose we are getting the same bucket each time, we insert
     * into the map, then in this case also, the linked list will grow large and worst case TC will be O(N)
     * But, there is something called TREEIFY threshold, whenever the size of LL reaches this threshold, then it converts
     * this LL to balanced BST(Red Black Tree). So, now in the worst case the TC will be O(logN).
     * Avg case TC is still O(1) only for all the operations in hashmap.
     *
     * Hashmap is not thread safe, while hashtable is thread safe.
     * Hashmap can have null keys nd null value, while hashtable cannot contain null key or value
     */
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
    }
}
