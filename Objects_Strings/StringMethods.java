public class StringMethods {
    public static void main(String[] args) {
        String str = "Hello World Java";
        String str2 = "  Programming  ";
        String str3 = "Hello";
        
        // 1. length()
        System.out.println("Length: " + str.length());
        
        // 2. concat()
        System.out.println("Concat: " + str.concat(" Programming"));
        
        // 3. charAt()
        System.out.println("Char at index 6: " + str.charAt(6));
        
        // 4. compareTo()
        System.out.println("CompareTo: " + str.compareTo(str3));
        
        // 5. equals()
        System.out.println("Equals 'Hello World Java': " + str.equals("Hello World Java"));
        
        // 6. startsWith()
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        
        // 7. endsWith()
        System.out.println("Ends with 'Java': " + str.endsWith("Java"));
        
        // 8. toUpperCase()
        System.out.println("Upper case: " + str.toUpperCase());
        
        // 9. toLowerCase()
        System.out.println("Lower case: " + str.toLowerCase());
        
        // 10. trim()
        System.out.println("Trimmed: '" + str2.trim() + "'");
        
        // 11. split()
        String[] words = str.split(" ");
        System.out.println("Split result: " + java.util.Arrays.toString(words));
        
        // 12. replace()
        System.out.println("Replace: " + str.replace("World", "Universe"));
    }
}