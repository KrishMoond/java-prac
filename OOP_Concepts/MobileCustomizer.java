public class MobileCustomizer {
    private String brand;
    private double price;
    private String color;
    private int warranty;
    
    public MobileCustomizer setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    
    public MobileCustomizer setPrice(double price) {
        this.price = price;
        return this;
    }
    
    public MobileCustomizer setColor(String color) {
        this.color = color;
        return this;
    }
    
    public MobileCustomizer setWarranty(int warranty) {
        this.warranty = warranty;
        return this;
    }
    
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Warranty: " + warranty + " years");
    }
    
    public static void main(String[] args) {
        new MobileCustomizer()
            .setBrand("iPhone")
            .setPrice(999)
            .setColor("Black")
            .setWarranty(2)
            .display();
    }
}