public class StringBufferDemo {
    public static void main(String[] args) {
        
        // StringBuffer is MUTABLE (can be modified)
        StringBuffer sb = new StringBuffer("Hello");
        System.out.println("Original: " + sb);
        
        // 1. append() - adds to end
        sb.append(" World");
        System.out.println("After append: " + sb);
        
        // 2. insert() - adds at specific position
        sb.insert(6, "Java ");
        System.out.println("After insert: " + sb);
        
        // 3. delete() - removes characters
        sb.delete(6, 11);
        System.out.println("After delete: " + sb);
        
        // 4. reverse() - reverses the string
        StringBuffer sb2 = new StringBuffer("ABC");
        sb2.reverse();
        System.out.println("Reversed: " + sb2);
        
        // 5. replace() - replaces substring
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
        
        // 6. capacity() and length()
        System.out.println("Length: " + sb.length());
        System.out.println("Capacity: " + sb.capacity());
        
        // Performance comparison
        System.out.println("\nPerformance Demo");
        
        // String concatenation (creates new objects)
        long start = System.currentTimeMillis();
        String str = "Start";
        for(int i = 0; i < 1000; i++) {
            str += i;  // Creates new String object each time
        }
        long stringTime = System.currentTimeMillis() - start;
        
        // StringBuffer concatenation (modifies same object)
        start = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Start");
        for(int i = 0; i < 1000; i++) {
            buffer.append(i);  // Modifies existing object
        }
        long bufferTime = System.currentTimeMillis() - start;
        
        System.out.println("String time: " + stringTime + "ms");
        System.out.println("StringBuffer time: " + bufferTime + "ms");
        
        // Key differences
        
        //String: Immutable, thread-safe
        //StringBuffer: Mutable, thread-safe, synchronized
        //StringBuilder: Mutable, NOT thread-safe, faster

        //assign capacity to stringbuffer
        StringBuffer sb3 = new StringBuffer();
        //assign data to sb3
        sb3.append("Hello");
        System.out.println(sb3);
        System.out.println(sb3.capacity());


    }
}