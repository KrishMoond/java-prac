import java.util.*;
public class BankBalance {
    public static double updateBalance(double currentBalance, double deposit) {
        return currentBalance + deposit;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter current balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter deposit amount: ");
        double deposit = sc.nextDouble();
        
        double newBalance = updateBalance(balance, deposit);
        System.out.println("Updated balance: " + newBalance);
        sc.close();
    }
}