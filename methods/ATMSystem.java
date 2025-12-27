import java.util.*;
public class ATMSystem {
    public static double withdraw(double balance, double amount) {
        if(amount <= balance) {
            return balance - amount;
        } else {
            System.out.println("Insufficient balance!");
            return balance;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter withdrawal amount: ");
        double amount = sc.nextDouble();
        
        double newBalance = withdraw(balance, amount);
        System.out.println("Updated balance: " + newBalance);
     }
}