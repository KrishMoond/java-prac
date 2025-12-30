import java.util.*;

public class PrimeNumbersInRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start range: ");
        int start = sc.nextInt();
        System.out.print("Enter end range: ");
        int end = sc.nextInt();
        
        System.out.println("Prime numbers between " + start + " and " + end + ":");
        
        for(int num = start; num <= end; num++){
            if(num <= 1) continue;
            
            boolean isPrime = true;
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime){
                System.out.print(num + " ");
            }
        }
    }
}