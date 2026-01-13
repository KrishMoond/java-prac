class InvalidTransactionAmountException extends Exception {
    InvalidTransactionAmountException(String message) { super(message); }
}

class DuplicateTransactionException extends Exception {
    DuplicateTransactionException(String message) { super(message); }
}

class TransactionTimeoutException extends Exception {
    TransactionTimeoutException(String message) { super(message); }
}

class PaymentGateway {
    private String[] processedRequestIds = {"REQ001", "REQ002"};
    
    void processTransaction(String requestId, double amount, int processingTime) throws InvalidTransactionAmountException, DuplicateTransactionException, TransactionTimeoutException {
        if (amount <= 0) {
            throw new InvalidTransactionAmountException("Transaction amount must be positive: " + amount);
        }
        
        for (String processedId : processedRequestIds) {
            if (processedId.equals(requestId)) {
                throw new DuplicateTransactionException("Request ID " + requestId + " already processed");
            }
        }
        
        if (processingTime > 30) {
            throw new TransactionTimeoutException("Transaction timeout after " + processingTime + " seconds");
        }
        
        System.out.println("Transaction successful: " + amount + " with request ID: " + requestId);
    }
}

public class PaymentGatewaySystem {
    public static void main(String[] args) {
        PaymentGateway gateway = new PaymentGateway();
        
        try {
            gateway.processTransaction("REQ003", -100, 25); // Negative amount
        } catch (InvalidTransactionAmountException | DuplicateTransactionException | TransactionTimeoutException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}