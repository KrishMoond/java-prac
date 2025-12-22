class ElectricityBill {
    public static void main(String[] args) {
        int unitsConsumed = 350;
        boolean isCommercialCustomer = false;
        double totalAmount = 0.0;
        
        boolean highRate = (unitsConsumed > 300) || isCommercialCustomer;
        
        double billAmount = highRate ? (unitsConsumed * 8.5) : (unitsConsumed * 5.0);
        
        double taxRate = highRate ? 0.18 : 0.12;
        
        totalAmount = billAmount;
        
         totalAmount += (billAmount * taxRate);
        
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Commercial Customer: " + isCommercialCustomer);
        System.out.println("High Rate Applied: " + highRate);
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Tax Rate: " + (taxRate * 100) + "%");
        System.out.println("Total Amount (with tax): " + totalAmount);
    }
}