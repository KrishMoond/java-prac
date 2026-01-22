import java.util.*;

/**
 * MethodReferenceDemo class demonstrating different types of method references
 * in Java 8+ including static method references and instance method references.
 */
public class MethodReferenceDemo {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        System.out.println("Static method reference - squares:");
        // Static method reference
        numbers.forEach(MathOperations::square);

        System.out.println("\nInstance method reference - cubes:");
        // Instance method reference
        MathOperations mathOps = new MathOperations();
        numbers.forEach(mathOps::cube);
        
        System.out.println("\nUsing lambda for comparison:");
        numbers.forEach(n -> System.out.println("Lambda: " + (n * 2)));
    }
}

/**
 * MathOperations class providing mathematical operations
 * for demonstrating method references.
 */
class MathOperations {
    
    /**
     * Static method to calculate square of a number
     * @param n Input number
     */
    public static void square(int n) {
        System.out.println(n + "² = " + (n * n));
    }

    /**
     * Instance method to calculate cube of a number
     * @param n Input number
     */
    public void cube(int n) {
        System.out.println(n + "³ = " + (n * n * n));
    }
}
