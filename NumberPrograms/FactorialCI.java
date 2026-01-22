import java.util.*;

public class FactorialCI {
    public static void main(String args[]){
        int num;
        
        if(args.length > 0) {
            // CI/CD friendly: use command-line arguments
            try {
                num = Integer.parseInt(args[0]);
                if(num < 0) {
                    System.err.println("Error: Factorial undefined for negative numbers");
                    System.exit(1);
                }
            } catch(NumberFormatException e) {
                System.err.println("Error: Invalid number format");
                System.exit(1);
                return;
            }
        } else {
            // Default value for CI when no args provided
            num = 5;
            System.out.println("No input provided, using default: " + num);
        }
        
        long factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}