import java.util.*;
public class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Add 2 integers");
        System.out.println("2. Add 3 integers");
        System.out.println("3. Add 2 decimals");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        
        if(choice == 1) {
            System.out.print("Enter 2 numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println("Result: " + add(x, y));
        } else if(choice == 2) {
            System.out.print("Enter 3 numbers: ");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println("Result: " + add(x, y, z));
        } else if(choice == 3) {
            System.out.print("Enter 2 decimals: ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            System.out.println("Result: " + add(x, y));
        }
        sc.close();
    }
}