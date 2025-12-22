class TrafficSystem {
    public static void main(String[] args) {
        int vehicleSpeed = 80;
        int speedLimit = 60;
        boolean isEmergencyService = false;
        double totalPenalty = 0.0;
        
         boolean shouldFine = (vehicleSpeed > speedLimit) && !isEmergencyService;
        
         double fineAmount = shouldFine ? 500.0 : 0.0;
        
         totalPenalty += fineAmount;
        
        System.out.println("Vehicle Speed: " + vehicleSpeed + " km/h");
        System.out.println("Speed Limit: " + speedLimit + " km/h");
        System.out.println("Emergency Service: " + isEmergencyService);
        System.out.println("Fine Applied: " + (shouldFine ? "Yes" : "No"));
        System.out.println("Fine Amount: " + fineAmount);
        System.out.println("Total Penalty: " + totalPenalty);
    }
}