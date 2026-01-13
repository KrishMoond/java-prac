class NetworkFailureException extends Exception {
    NetworkFailureException(String message) { super(message); }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { super(message); }
}

class InvalidBeneficiaryException extends Exception {
    InvalidBeneficiaryException(String message) { super(message); }
}

class BankAccount {
    private String accountNumber;
    private double balance;
    
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    String getAccountNumber() { return accountNumber; }
    double getBalance() { return balance; }
    void debit(double amount) { this.balance -= amount; }
}

class MoneyTransferSystem {
    private BankAccount[] accounts = {
        new BankAccount("ACC001", 5000),
        new BankAccount("ACC002", 3000)
    };
    private boolean networkUp = true;
    
    void transferMoney(String fromAccount, String toAccount, double amount) throws NetworkFailureException, InsufficientBalanceException, InvalidBeneficiaryException {
        if (!networkUp) {
            throw new NetworkFailureException("Network connection failed during transfer");
        }
        
        BankAccount sender = findAccount(fromAccount);
        BankAccount receiver = findAccount(toAccount);
        
        if (sender == null) {
            throw new InvalidBeneficiaryException("Sender account " + fromAccount + " not found");
        }
        if (receiver == null) {
            throw new InvalidBeneficiaryException("Beneficiary account " + toAccount + " not found");
        }
        if (sender.getBalance() < amount) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + sender.getBalance());
        }
        
        sender.debit(amount);
        System.out.println("Transfer successful: " + amount + " from " + fromAccount + " to " + toAccount);
    }
    
    private BankAccount findAccount(String accountNumber) {
        for (BankAccount account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
    
    void setNetworkStatus(boolean status) { this.networkUp = status; }
}

public class MoneyTransfer {
    public static void main(String[] args) {
        MoneyTransferSystem transfer = new MoneyTransferSystem();
        
        try {
            transfer.transferMoney("ACC001", "ACC003", 1000); // Invalid beneficiary
        } catch (NetworkFailureException | InsufficientBalanceException | InvalidBeneficiaryException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        }
    }
}