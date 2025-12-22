class TelecomAlert {
    public static void main(String[] args) {
        double dailyDataLimit = 2.0;  
        double dataUsage = 1.85; 
        
         double percentageUsed = (dataUsage / dailyDataLimit) * 100;
        
         boolean sendAlert = percentageUsed >= 90.0;
        
        System.out.println("Daily Data Limit: " + dailyDataLimit + " GB");
        System.out.println("Data Usage: " + dataUsage + " GB");
        System.out.println("Percentage Used: " + percentageUsed + "%");
        System.out.println("Alert Status: " + (sendAlert ? "Alert" : "No Alert"));
    }
}