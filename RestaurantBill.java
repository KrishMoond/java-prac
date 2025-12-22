class RestaurantBill {
    public static void main(String[] args) {
        double totalBill = 2000.0;
        int numberOfPeople = 4;
        double gstRate = 0.18; 
        
         double gstAmount = totalBill * gstRate;
        double totalWithGST = totalBill + gstAmount;
        
         double amountPerPerson = totalWithGST / numberOfPeople;
        
        System.out.println("Total Bill: " + totalBill);
        System.out.println("GST (18%): " + gstAmount);
        System.out.println("Total with GST: " + totalWithGST);
        System.out.println("Number of People: " + numberOfPeople);
        System.out.println("Amount per Person: " + amountPerPerson);
    }
}