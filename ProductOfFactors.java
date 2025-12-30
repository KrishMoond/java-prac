import java.util.*;

public class ProductOfFactors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        long product = 1;
        
        System.out.print("Factors of " + num + ": ");
        for(int i = 1; i <= num; i++){
            if(num % i == 0){
                System.out.print(i + " ");
                product *= i;
            }
        }
        
        System.out.println("\nProduct of factors: " + product);
         
    }
}