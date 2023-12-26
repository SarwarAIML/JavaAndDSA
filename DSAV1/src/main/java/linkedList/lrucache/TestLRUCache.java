package linkedList.lrucache;

public class TestLRUCache {

    public static void main(String[] args)
    {
        LRUCache cache = new LRUCache(2);
        // it will store a key (1) with value
        // 10 in the cache.
        cache.set(1, 10);
        // it will store a key (2) with value 20 in the cache.
        cache.set(2, 20);
        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns 10
        // removing key 2 and store a key (3) with value 30 in the cache.
        cache.set(3, 30);
        System.out.println("Value for the key: 2 is " + cache.get(2)); // returns -1 (not found)
        // removing key 1 and store a key (4) with value 40 in the cache.
        cache.set(4, 40);
        System.out.println("Value for the key: 1 is " + cache.get(1)); // returns -1 (not found)
        System.out.println("Value for the key: 3 is " + cache.get(3)); // returns 30
        System.out.println("Value for the key: 4 is " + cache.get(4)); // return 40
    }
}