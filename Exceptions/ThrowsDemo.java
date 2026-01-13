import java.io.*;

public class ThrowsDemo {
    
    // Method that throws checked exception - MUST be handled
    static void readFile() throws IOException {
        FileReader file = new FileReader("nonexistent.txt");
    }
    
    // Method that throws unchecked exception - Optional to declare
    static void divide(int a, int b) throws ArithmeticException {
        System.out.println(a / b);
    }
    
    // Method that throws multiple exceptions
    static void processData(String str) throws NullPointerException, NumberFormatException {
        int length = str.length(); // Can throw NullPointerException
        int num = Integer.parseInt(str); // Can throw NumberFormatException
        System.out.println("Processed: " + num);
    }
    
    // Method that calls another method with throws
    static void callReadFile() throws IOException {
        readFile(); // Must handle or propagate the exception
    }
    
    // Method that handles exception instead of throwing
    static void safeReadFile() {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        System.out.println("=== THROWS Keyword Demo ===\n");
        
        // 1. Handling checked exception
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("1. Caught IOException: " + e.getMessage());
        }
        
        // 2. Unchecked exception (optional throws)
        try {
            divide(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("2. Caught ArithmeticException: " + e.getMessage());
        }
        
        // 3. Multiple exceptions
        try {
            processData(null);
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("3. Caught: " + e.getClass().getSimpleName());
        }
        
        // 4. Propagated exception
        try {
            callReadFile();
        } catch (IOException e) {
            System.out.println("4. Propagated IOException caught");
        }
        
        // 5. Exception handled internally
        safeReadFile();
        
       
        // throws: Declares exceptions a method might throw
        // Checked exceptions: MUST be handled or declared
        // Unchecked exceptions: Optional to declare
        // Caller must handle or propagate declared exceptions
    }
}