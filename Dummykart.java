class Dummykart {
    public static void main(String[] args) {
        double cartValue = 3500.0;
        boolean isPremiumMember = true;
        
        boolean discountApplied = (cartValue > 3000) && isPremiumMember;
        
        double discount = discountApplied ? (cartValue * 0.20) : 0.0;
        double finalAmount = cartValue - discount;
        
        System.out.println("Cart Value: " + cartValue);
        System.out.println("Premium Member: " + isPremiumMember);
        System.out.println("Discount Applied: " + (discountApplied ? "Yes" : "No"));
        System.out.println("Discount Amount: " + discount);
        System.out.println("Final Amount to Pay: " + finalAmount);
    }
}