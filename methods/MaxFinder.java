import java.util.*;
public class MaxFinder {
    public static int findMax(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int maximum = findMax(num1, num2);
        System.out.println("Maximum: " + maximum);
        sc.close();
    }
}