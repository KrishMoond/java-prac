import java.util.*;
public class DoWhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String choice;
        
         int i = 1;
        System.out.println("Do-while loop 1 to 3:");
        do {
            System.out.println(i);
            i++;
        } while(i <= 3);
        
         do {
            System.out.println("\n1. Say Hello");
            System.out.println("2. Say Goodbye");
            System.out.print("Enter choice (1/2) or 'exit': ");
            choice = sc.next();
            
            if(choice.equals("1")){
                System.out.println("Hello!");
            } else if(choice.equals("2")){
                System.out.println("Goodbye!");
            }
            
        } while(!choice.equals("exit"));
        
    
    }
}