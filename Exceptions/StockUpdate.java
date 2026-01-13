class NegativeStockException extends Exception {
    NegativeStockException(String message) { super(message); }
}

class DataMismatchException extends Exception {
    DataMismatchException(String message) { super(message); }
}

class WarehouseSyncFailureException extends Exception {
    WarehouseSyncFailureException(String message) { super(message); }
}

class StockUpdateSystem {
    private int currentStock = 100;
    private int warehouseStock = 100;
    private boolean syncEnabled = true;
    
    void updateStock(int newStock) throws NegativeStockException, DataMismatchException, WarehouseSyncFailureException {
        if (newStock < 0) {
            throw new NegativeStockException("Stock cannot be negative: " + newStock);
        }
        
        if (Math.abs(newStock - warehouseStock) > 10) {
            throw new DataMismatchException("Stock mismatch with warehouse. System: " + newStock + ", Warehouse: " + warehouseStock);
        }
        
        if (!syncEnabled) {
            throw new WarehouseSyncFailureException("Failed to sync with warehouse system");
        }
        
        currentStock = newStock;
        System.out.println("Stock updated successfully to: " + currentStock);
    }
    
    void setSyncStatus(boolean status) { this.syncEnabled = status; }
    void setWarehouseStock(int stock) { this.warehouseStock = stock; }
}

public class StockUpdate {
    public static void main(String[] args) {
        StockUpdateSystem system = new StockUpdateSystem();
        
        try {
            system.updateStock(-5); // Negative stock
        } catch (NegativeStockException | DataMismatchException | WarehouseSyncFailureException e) {
            System.out.println("Stock update failed: " + e.getMessage());
        }
    }
}