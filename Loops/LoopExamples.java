import java.util.*;

/**
 * LoopExamples class demonstrating various loop patterns
 * and interactive programming with user input.
 */
public class LoopExamples {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        // Example 1: Character input loop with exit condition
        System.out.println("=== Character Input Loop Example ===");
        characterInputLoop(sc);
        
        // Example 2: ASCII character display loop
        System.out.println("\n=== ASCII Character Display ===");
        displayAsciiCharacters();
        
        sc.close();
    }
    
    /**
     * Demonstrates do-while loop with user input
     * @param sc Scanner object for input
     */
    private static void characterInputLoop(Scanner sc) {
        String choice;
        
        do {
            String printedChars = "";
            System.out.println("Enter characters (type 'exit' to stop):");
            
            while(sc.hasNext()) {
                String input = sc.next();
                if(input.equals("exit")) {
                    break;
                } 
                char ch = input.charAt(0);
                printedChars += ch + " ";
            }
            
            System.out.println("Characters you entered: " + printedChars);
            System.out.print("Do you want to continue? (yes/no): ");
            choice = sc.next();
            
        } while(choice.equals("yes"));
        
        System.out.println("Character input loop ended.");
    }
    
    /**
     * Demonstrates for loop with ASCII character conversion
     */
    private static void displayAsciiCharacters() {
        System.out.println("ASCII values and corresponding characters:");
        for(int i = 98; i < 116; i += 2) {
            System.out.println(i + " -> " + (char)i);
        }
    }
}
