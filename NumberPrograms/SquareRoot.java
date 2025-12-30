import java.util.*;

public class SquareRoot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        double sqrt = Math.sqrt(num);
        System.out.println("Square root of " + num + " is: " + sqrt);
         
    }
}