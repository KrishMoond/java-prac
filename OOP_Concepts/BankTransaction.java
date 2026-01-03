class TransactionHistory {
    private String[] transactions;
    
    public TransactionHistory() {
        transactions = new String[3];
        transactions[0] = "Deposit: $1000";
        transactions[1] = "Withdrawal: $200";
        transactions[2] = "Transfer: $300";
        System.out.println("Transaction history created when needed");
    }
    
    public void display() {
        System.out.println("Transaction History:");
        for(int i = 0; i < transactions.length; i++) {
            System.out.println((i+1) + ". " + transactions[i]);
        }
    }
}

public class BankTransaction {
    private String accountNumber;
    private double balance;
    private TransactionHistory history; // Not created immediately
    
    public BankTransaction(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Bank account created without transaction history");
    }
    
    // Create transaction history only when user views it
    public void viewTransactionHistory() {
        if(history == null) {
            history = new TransactionHistory();
        }
        history.display();
    }
    
    public void showBalance() {
        System.out.println("Account: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    
    public static void main(String[] args) {
        BankTransaction account = new BankTransaction("12345", 5000);
        
        account.showBalance(); // No transaction history created yet
        
        account.viewTransactionHistory(); // Transaction history created when viewed
    }
}