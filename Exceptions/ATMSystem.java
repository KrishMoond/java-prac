import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) { 
        super(message); 
    }
}

class InvalidPINException extends Exception {
    InvalidPINException(String message) { 
        super(message); 
    }
}

class ATMOutOfCashException extends Exception {
    ATMOutOfCashException(String message) { 
        super(message); 
    }
}

class ATM {
    private int userBalance = 500000;
    private int correctPIN = 1234;
    private int atmCash = 10000;
    
    void withdraw(int pin, int amount) throws InvalidPINException, InsufficientBalanceException, ATMOutOfCashException {
        if (pin != correctPIN) {
            throw new InvalidPINException("Invalid PIN entered");
        }
        if (amount > userBalance) {
            throw new InsufficientBalanceException("Insufficient balance. Available: " + userBalance);
        }
        if (amount > atmCash) {
            throw new ATMOutOfCashException("ATM out of cash. Available: " + atmCash);
        }
        
        userBalance -= amount;
        atmCash -= amount;
        System.out.println("Withdrawal successful! Amount: " + amount + ", Remaining balance: " + userBalance);
    }
}

public class ATMSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();
        
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter amount to withdraw: ");
        int amount = sc.nextInt();
        
        try {
            atm.withdraw(pin, amount);
        } catch (InvalidPINException | InsufficientBalanceException | ATMOutOfCashException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
        
    }
} 