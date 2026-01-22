import java.util.*;

public class Factorial {
    
    /**
     * Calculates factorial of a number
     * Works in both interactive and non-interactive (CI/CD) environments
     */
    public static void main(String args[]){
        int num;
        
        // Strategy 1: Use command-line arguments (CI/CD friendly)
        if(args.length > 0) {
            try {
                num = Integer.parseInt(args[0]);
                if(num < 0) {
                    System.err.println("Error: Factorial is undefined for negative numbers");
                    System.exit(1);
                }
            } catch(NumberFormatException e) {
                System.err.println("Error: Invalid number format");
                System.exit(1);
                return;
            }
        } else {
            // Strategy 2: Interactive input (local testing)
            Scanner sc = new Scanner(System.in);
            try {
                // Check if input is available before reading
                if(!sc.hasNextInt()) {
                    System.err.println("Error: No valid input provided (use: java Factorial <number> or pipe input)");
                    System.exit(1);
                }
                
                System.out.print("Enter a number: ");
                num = sc.nextInt();
                
                if(num < 0) {
                    System.err.println("Error: Factorial is undefined for negative numbers");
                    System.exit(1);
                }
                
            } catch(NoSuchElementException e) {
                System.err.println("Error: Input stream ended unexpectedly");
                System.exit(1);
                return;
            } finally {
                sc.close();
            }
        }
        
        // Calculate factorial
        long factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}