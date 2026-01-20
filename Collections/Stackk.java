import java.util.*;
public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);

        //pop
        stack.pop();
        System.out.println("Stack after pop: " + stack);

        //peek
        System.out.println("Top element: " + stack.peek());

        //search method
        System.out.println("Position of 10: " + stack.search(10));
        
    }
}
