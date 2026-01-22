import java.util.*;

/**
 * HashMapDemo class demonstrating all essential HashMap methods
 * and operations with clear examples.
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. put() - Add key-value pairs
        map.put("John", 25);
        map.put("Jane", 30);
        map.put("Bob", 35);
        System.out.println("After put(): " + map);
        
        // 2. get() - Get value by key
        System.out.println("get('John'): " + map.get("John"));
        
        // 3. remove() - Remove by key
        map.remove("Bob");
        System.out.println("After remove('Bob'): " + map);
        
        // 4. containsKey() - Check if key exists
        System.out.println("containsKey('Jane'): " + map.containsKey("Jane"));
        
        // 5. containsValue() - Check if value exists
        System.out.println("containsValue(25): " + map.containsValue(25));
        
        // 6. size() - Get size
        System.out.println("size(): " + map.size());
        
        // 7. isEmpty() - Check if empty
        System.out.println("isEmpty(): " + map.isEmpty());
        
        // 8. keySet() - Get all keys
        System.out.println("keySet(): " + map.keySet());
        
        // 9. values() - Get all values
        System.out.println("values(): " + map.values());
        
        // 10. entrySet() - Get key-value pairs
        System.out.println("entrySet(): " + map.entrySet());
        
        // 11. putAll() - Add another map
        HashMap<String, Integer> map2 = new HashMap<>();
        map2.put("Alice", 28);
        map.putAll(map2);
        System.out.println("After putAll(): " + map);
        
        // 12. replace() - Replace value
        map.replace("John", 26);
        System.out.println("After replace('John', 26): " + map);
        
        // 13. getOrDefault() - Get value or default
        System.out.println("getOrDefault('Tom', 0): " + map.getOrDefault("Tom", 0));
        
        // 14. putIfAbsent() - Put if key doesn't exist
        map.putIfAbsent("Tom", 40);
        System.out.println("After putIfAbsent('Tom', 40): " + map);
        
        // 15. clear() - Remove all elements
        map.clear();
        System.out.println("After clear(): " + map);
        System.out.println("isEmpty after clear(): " + map.isEmpty());
    }
}
