class RefundAlreadyProcessedException extends Exception {
    RefundAlreadyProcessedException(String message) { super(message); }
}

class InvalidTransactionIdException extends Exception {
    InvalidTransactionIdException(String message) { super(message); }
}

class Transaction {
    private String transactionId;
    private boolean refundProcessed;
    
    Transaction(String transactionId) {
        this.transactionId = transactionId;
        this.refundProcessed = false;
    }
    
    String getTransactionId() { return transactionId; }
    boolean isRefundProcessed() { return refundProcessed; }
    void setRefundProcessed(boolean status) { this.refundProcessed = status; }
}

class RefundSystem {
    private Transaction[] transactions = {
        new Transaction("TXN001"),
        new Transaction("TXN002")
    };
    
    void initiateRefund(String transactionId) throws RefundAlreadyProcessedException, InvalidTransactionIdException {
        Transaction transaction = findTransaction(transactionId);
        
        if (transaction == null) {
            throw new InvalidTransactionIdException("Transaction ID " + transactionId + " is invalid");
        }
        
        if (transaction.isRefundProcessed()) {
            throw new RefundAlreadyProcessedException("Refund already processed for transaction: " + transactionId);
        }
        
        transaction.setRefundProcessed(true);
        System.out.println("Refund initiated successfully for transaction: " + transactionId);
    }
    
    private Transaction findTransaction(String transactionId) {
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionId().equals(transactionId)) {
                return transaction;
            }
        }
        return null;
    }
}

public class RefundInitiation {
    public static void main(String[] args) {
        RefundSystem refund = new RefundSystem();
        
        try {
            refund.initiateRefund("TXN003"); // Invalid transaction ID
        } catch (RefundAlreadyProcessedException | InvalidTransactionIdException e) {
            System.out.println("Refund failed: " + e.getMessage());
        }
    }
}