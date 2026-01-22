/**
 * Calculator interface defining basic operations
 */
interface Calculator {
    /**
     * Display method to show interface implementation
     */
    void display();
    
    /**
     * Add two integers
     * @param a First number
     * @param b Second number
     * @return Sum of a and b
     */
    int add(int a, int b);
}

/**
 * InterfaceDemo class demonstrating interface implementation
 * with Calculator interface methods.
 */
public class InterfaceDemo implements Calculator {
    
    @Override
    public void display() {
        System.out.println("Hello Interface - Calculator Implementation");
    }
    
    @Override
    public int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        InterfaceDemo obj = new InterfaceDemo();
        obj.display();
        System.out.println("Sum: " + obj.add(5, 3));
        
        // Demonstrating interface reference
        Calculator calc = new InterfaceDemo();
        calc.display();
        System.out.println("Sum using interface reference: " + calc.add(10, 20));
    }
}
