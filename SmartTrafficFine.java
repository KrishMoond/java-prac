class SmartTrafficFine {
    public static void main(String[] args) {
        int speedLimit = 60; 
        int currentSpeed = 75; 
        boolean seatBeltWorn = false;
        
         boolean shouldFine = (currentSpeed > speedLimit) && !seatBeltWorn;
        
         double fineAmount = shouldFine ? 1000.0 : 0.0;
        
        System.out.println("Speed Limit: " + speedLimit + " km/h");
        System.out.println("Current Speed: " + currentSpeed + " km/h");
        System.out.println("Seat Belt Worn: " + seatBeltWorn);
        
        if (shouldFine) {
            System.out.println("Fine Amount: ₹" + fineAmount);
        } else {
            System.out.println("Safe Driving - No Fine");
        }
    }
}