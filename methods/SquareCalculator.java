import java.util.*;
public class SquareCalculator {
    public static int calculateSquare(int number) {
        return number * number;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find square: ");
        int num = sc.nextInt();
        
        int square = calculateSquare(num);
        System.out.println("Square of " + num + " is: " + square);
        sc.close();
    }
}