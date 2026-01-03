public class BankWithdrawal {
    private double balance = 20000; 
    
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Amount must be positive!");
        } else if(balance - amount < 15000) {
            System.out.println("Cannot withdraw! Minimum balance 15000 required");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        BankWithdrawal account = new BankWithdrawal();
        System.out.println("Initial balance: " + account.getBalance());
        
        account.withdraw(3000); // Valid
        account.withdraw(10000); // Invalid - would go below 15000
        System.out.println("Final balance: " + account.getBalance());
    }
}