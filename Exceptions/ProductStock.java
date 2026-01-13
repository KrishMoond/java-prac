import java.util.Scanner;

class OutOfStockException extends Exception {
    OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    private String name;
    private int stock;
    
    Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    
    void buyProduct(int quantity) throws OutOfStockException {
        if (quantity > stock) {
            throw new OutOfStockException("Only " + stock + " items available, cannot buy " + quantity);
        }
        stock -= quantity;
        System.out.println("Purchase successful! " + quantity + " " + name + " bought. Remaining stock: " + stock);
    }
    
    int getStock() {
        return stock;
    }
}

public class ProductStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product laptop = new Product("Laptop", 5);
        
        System.out.println("Available stock: " + laptop.getStock());
        System.out.print("Enter quantity to buy: ");
        int quantity = sc.nextInt();
        
        try {
            laptop.buyProduct(quantity);
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}