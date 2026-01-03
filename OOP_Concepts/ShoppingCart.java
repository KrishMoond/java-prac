public class ShoppingCart {
    private String productName;
    private double price;
    private double discount;
    private int quantity;
    
    public ShoppingCart setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    
    public ShoppingCart setPrice(double price) {
        this.price = price;
        return this;
    }
    
    public ShoppingCart setDiscount(double discount) {
        this.discount = discount;
        return this;
    }
    
    public ShoppingCart setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }
    
    public void display() {
        double finalPrice = (price - discount) * quantity;
        System.out.println("Product: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Discount: $" + discount);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: $" + finalPrice);
    }
    
    public static void main(String[] args) {
        new ShoppingCart()
            .setProductName("Laptop")
            .setPrice(1000)
            .setDiscount(100)
            .setQuantity(2)
            .display();
    }
}