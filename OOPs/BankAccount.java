public class BankAccount {
    private double balance;
    
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    public double getBalance() {
        return balance;
    }
    
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(5000);
        account.deposit(2000);
        System.out.println("Current balance: " + account.getBalance());
        
        account.deposit(-500); // Invalid
    }
}