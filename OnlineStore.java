class OnlineStore {
    public static void main(String[] args) {
        double purchaseAmount = 2500;
        boolean isPremiumMember = true;
        boolean isFirstTimeCustomer = false;
        
         boolean eligibleForDiscount = (purchaseAmount > 2000 && isPremiumMember) || !isFirstTimeCustomer;
        
         double discountPercent = eligibleForDiscount ? 10.0 : 0.0;
        
         double finalPrice = eligibleForDiscount ? purchaseAmount * 0.9 : purchaseAmount;
        
         purchaseAmount -= (purchaseAmount * discountPercent / 100);
        
        System.out.println("Purchase Amount: " + 2500);
        System.out.println("Premium Member: " + isPremiumMember);
        System.out.println("First Time Customer: " + isFirstTimeCustomer);
        System.out.println("Eligible for Discount: " + eligibleForDiscount);
        System.out.println("Discount: " + discountPercent + "%");
        System.out.println("Final Price: " + finalPrice);
        System.out.println("Bill after compound assignment: " + purchaseAmount);
    }
}