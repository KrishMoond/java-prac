import java.util.*;
public class EcommerceBill {
    public static double calculateBill(double price1) {
        return price1;
    }
    
    public static double calculateBill(double price1, double price2) {
        return price1 + price2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many products (1 or 2): ");
        int count = sc.nextInt(); 
        
        if(count == 1) {
            System.out.print("Enter price: ");
            double price = sc.nextDouble();
            System.out.println("Total bill: " + calculateBill(price));
        } 
        else {
            System.out.print("Enter price 1: ");
            double price1 = sc.nextDouble();
            System.out.print("Enter price 2: ");
            double price2 = sc.nextDouble();
            System.out.println("Total bill: " + calculateBill(price1, price2));
        }
      
    }
}