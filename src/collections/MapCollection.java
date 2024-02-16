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
     * Still, if the size of hashmap is very large, but let's suppose we are getting the same bucket each time, we insert
     * into the map, then in this case also, the linked list will grow large and worst case TC will be O(N)
     * But, there is something called TREEIFY threshold, whenever the size of LL reaches this threshold, then it converts
     * this LL to balanced BST(Red Black Tree). So, now in the worst case the TC will be O(logN).
     * Avg case TC is still O(1) only for all the operations in hashmap.
     *
     * Hashmap is not thread safe, while hashtable is thread safe.
     * Hashmap can have null keys and null value, while hashtable cannot contain null key or value
     *
     * HashTable is same as HashMap, but thread, here locking is done on entire array of buckets. Due to this,
     * it is less efficient than concurrent hashmap.
     * ConcurrentHashMap is same as Hashmap but thread safe. Here locking is done on bucket level;
     *
     *
     * Collision Handling Techniques
     * -> Separate Chaining: Chaining is a simple collision resolution technique where each bucket in the hash table is
     *  a linked list. When a collision occurs, the collided elements are appended to the linked list at the
     *  corresponding bucket. Chaining allows multiple elements with different keys to reside in the same bucket
     *  without any restrictions.
     *
     *  Open Addressing: Open addressing is another collision resolution technique where collisions are resolved by
     *  finding an alternative location within the hash table itself. There are several methods for open addressing:
     * i. Linear Probing: In linear probing, if a collision occurs, the algorithm checks the next available slot in the
     * table until an empty slot is found.
     *
     * ii. Quadratic Probing: Quadratic probing uses a quadratic function to compute the next probe location.
     * It has less clustering than linear probing but may still suffer from primary clustering.
     *
     * iii. Double Hashing: Double hashing uses a secondary hash function to compute the probe sequence. It typically
     * produces more evenly distributed probe sequences compared to linear or quadratic probing.
     */
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
    }
}
