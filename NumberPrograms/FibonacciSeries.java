import java.util.*;

public class FibonacciSeries {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range: ");
        int range = sc.nextInt();
        
        int a = 0, b = 1;
        System.out.print("Fibonacci series: " + a + " " + b + " ");
        
        for(int i = 2; i < range; i++){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        
    }
}