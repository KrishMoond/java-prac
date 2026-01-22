import java.util.*;

public class Mapp {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "Alice");
        map.put(102, "Bob");
        map.put(103, "Charlie");

        // Print all key-value pairs using for-each loop and lambda
        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
         
        List<Integer> keys = Arrays.asList(101, 102, 103);
        // Print values for specific keys using lambda
        keys.forEach(key -> System.out.println("Value for key " + key + ": " + map.get(key)));

        List<Integer> keyList = new ArrayList<>(map.keySet());
        // Print all keys using lambda  
        keyList.forEach(key -> System.out.println("Key: " + key));

        //remove a key-value pair using lambda
        int keyToRemove = 102;
        map.entrySet().removeIf(entry -> entry.getKey() == keyToRemove);
        System.out.println("After removing key " + keyToRemove + ": " + map);

        //replace value for a key using lambda
        int keyToReplace = 103;
        String newValue = "David";
        map.replaceAll((k, v) -> k == keyToReplace ? newValue : v);
        System.out.println("After replacing value for key " + keyToReplace + ": " + map);
    
        List<String> l= new ArrayList(Arrays.asList("JAVA","PYTHON","NODEJS","DJANGO"));
        l.replaceAll(s->s.toLowerCase());
        System.out.println("After replacing all values to lowercase: "+l);

        //if string lenght is geater than 4 then replace with first 3 characters
        l.replaceAll(s->s.length()>4?s.substring(0,3):s);
        System.out.println("After conditional replacement: "+l);

        //replcae a with *
        l.replaceAll(s -> s.replace("a", "*").replace("A", "*"));
        System.out.println("After replacing 'a' with '*': " + l);
        
    }   
}
