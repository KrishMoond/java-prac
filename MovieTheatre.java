class MovieTheatre {
    public static void main(String[] args) {
        double ticketPrice = 250.0;
        int age = 65;
        
        boolean discountEligible = (age < 12) || (age > 60);
        
        double discount = discountEligible ? (ticketPrice * 0.30) : 0.0;
        double finalPrice = ticketPrice - discount;
        
        System.out.println("Original Ticket Price: " + ticketPrice);
        System.out.println("Customer Age: " + age);
        System.out.println("Discount Applied: " + (discountEligible ? "Yes (30%)" : "No"));
        System.out.println("Final Ticket Price: " + finalPrice);
    }
}