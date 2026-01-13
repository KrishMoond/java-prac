class DuplicateViolationException extends Exception {
    DuplicateViolationException(String message) { super(message); }
}

class LicenseSuspendedException extends Exception {
    LicenseSuspendedException(String message) { super(message); }
}

class InsuranceExpiredException extends Exception {
    InsuranceExpiredException(String message) { super(message); }
}

class TrafficViolationSystem {
    private String[] recordedViolations = {"SPEED001", "SIGNAL002"};
    private int violationCount = 8;
    private int maxViolations = 10;
    private boolean insuranceValid = false;
    
    void recordViolation(String violationId, String vehicleNumber) throws DuplicateViolationException, LicenseSuspendedException, InsuranceExpiredException {
        for (String recorded : recordedViolations) {
            if (recorded.equals(violationId)) {
                throw new DuplicateViolationException("Violation " + violationId + " already recorded");
            }
        }
        
        if (!insuranceValid) {
            throw new InsuranceExpiredException("Vehicle insurance expired for " + vehicleNumber);
        }
        
        violationCount++;
        if (violationCount >= maxViolations) {
            throw new LicenseSuspendedException("License suspended after " + violationCount + " violations");
        }
        
        System.out.println("Violation recorded: " + violationId + " for vehicle: " + vehicleNumber);
    }
    
    void setInsuranceStatus(boolean status) { this.insuranceValid = status; }
}

public class TrafficViolation {
    public static void main(String[] args) {
        TrafficViolationSystem traffic = new TrafficViolationSystem();
        
        try {
            traffic.recordViolation("SPEED003", "KA01AB1234");
        } catch (DuplicateViolationException | LicenseSuspendedException | InsuranceExpiredException e) {
            System.out.println("Violation recording failed: " + e.getMessage());
        }
    }
}