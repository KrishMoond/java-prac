import java.util.*;
public class WhileLoop {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        
        int count = 1;
        System.out.println("While loop 1 to 3:");
        while(count <= 3){
            System.out.println(count);
            count++;
        }
        
         System.out.println("\nEnter numbers (0 to stop):");
        int num = sc.nextInt();
        while(num != 0){
            System.out.println("You entered: " + num);
            num = sc.nextInt();
        }
        
         
    }
}