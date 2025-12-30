import java.util.*;

public class SumOfFactorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp = num;
        
        while(temp > 0){
            int digit = temp % 10;
            int factorial = 1;
            for(int i = 1; i <= digit; i++){
                factorial *= i;
            }
            sum += factorial;
            temp /= 10;
        }
        
        System.out.println("Sum of factorial of digits of " + num + " is: " + sum);
        
    }
}