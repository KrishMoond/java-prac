class BankSystem {
    public static void main(String[] args) {
        double balance = 1500.0;
        boolean isActive = true;
        double withdrawalAmount = 500.0;
        
         boolean canWithdraw = (balance > 0) && isActive;
        
         String message = canWithdraw ? "Withdrawal Allowed" : "Withdrawal Denied";
        
         balance -= canWithdraw ? withdrawalAmount : 0;
        
        System.out.println("Initial Balance: 1500.0");
        System.out.println("Account Active: " + isActive);
        System.out.println("Withdrawal Amount: " + withdrawalAmount);
        System.out.println("Status: " + message);
        System.out.println("Final Balance: " + balance);
    }
}