class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { 
        super(message); 
    }
}

class DailyLimitExceededException extends Exception {
    DailyLimitExceededException(String message) { 
        super(message);
     }
}

class EMIDefaultException extends Exception {
    EMIDefaultException(String message) { 
        super(message);
     }
}

class BankAccount {
    private double balance;
    private double minBalance;
    private double dailyWithdrawn = 0;
    private double dailyLimit = 10000;
    
    BankAccount(double balance, double minBalance) {
        this.balance = balance;
        this.minBalance = minBalance;
    }
    
    void withdraw(double amount) throws InsufficientBalanceException, DailyLimitExceededException {
        if (balance - amount < minBalance) {
            throw new InsufficientBalanceException("Minimum balance " + minBalance + " must be maintained");
        }
        if (dailyWithdrawn + amount > dailyLimit) {
            throw new DailyLimitExceededException("Daily limit " + dailyLimit + " exceeded");
        }
        
        balance -= amount;
        dailyWithdrawn += amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }
    
    void payEMI(double emiAmount, boolean skipEMI) throws EMIDefaultException {
        if (skipEMI) {
            throw new EMIDefaultException("Loan EMI cannot be skipped");
        }
        System.out.println("EMI paid: " + emiAmount);
    }
}

public class CoreBankingSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000, 1000);
        
        try {
            account.withdraw(4500); // Would go below minimum balance
        } catch (InsufficientBalanceException | DailyLimitExceededException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        
        try {
            account.payEMI(2000, true); // Trying to skip EMI
        } catch (EMIDefaultException e) {
            System.out.println("EMI failed: " + e.getMessage());
        }
    }
}