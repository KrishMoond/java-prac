import java.util.*;

/**
 * StackDemo class demonstrating Stack operations
 * including push, pop, peek, and search methods.
 */
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        // Push elements onto stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        // Pop - remove top element
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peek - view top element without removing
        System.out.println("Top element: " + stack.peek());

        // Search - find position of element (1-based from top)
        System.out.println("Position of 10: " + stack.search(10));
        
        // Check if stack is empty
        System.out.println("Is stack empty: " + stack.isEmpty());
        
        // Get stack size
        System.out.println("Stack size: " + stack.size());
    }
}
