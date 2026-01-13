class InvalidSalaryException extends Exception {
    InvalidSalaryException(String message) { super(message); }
}

class LeaveLimitExceededException extends Exception {
    LeaveLimitExceededException(String message) { super(message); }
}

class InsufficientExperienceException extends Exception {
    InsufficientExperienceException(String message) { super(message); }
}

class PayrollSystem {
    private int usedLeaves = 20;
    private int maxLeaves = 25;
    
    void processSalary(double salary) throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative: " + salary);
        }
        System.out.println("Salary processed: " + salary);
    }
    
    void applyLeave(int leaveDays) throws LeaveLimitExceededException {
        if (usedLeaves + leaveDays > maxLeaves) {
            throw new LeaveLimitExceededException("Leave limit exceeded. Used: " + usedLeaves + ", Requesting: " + leaveDays + ", Max: " + maxLeaves);
        }
        usedLeaves += leaveDays;
        System.out.println("Leave approved. Total used: " + usedLeaves);
    }
    
    void processPromotion(int experienceYears) throws InsufficientExperienceException {
        if (experienceYears < 2) {
            throw new InsufficientExperienceException("Minimum 2 years experience required. Current: " + experienceYears);
        }
        System.out.println("Promotion approved");
    }
}

public class PayrollManagement {
    public static void main(String[] args) {
        PayrollSystem payroll = new PayrollSystem();
        
        try {
            payroll.processSalary(-5000); // Negative salary
        } catch (InvalidSalaryException e) {
            System.out.println("Salary error: " + e.getMessage());
        }
        
        try {
            payroll.applyLeave(10); // Exceeds limit
        } catch (LeaveLimitExceededException e) {
            System.out.println("Leave error: " + e.getMessage());
        }
        
        try {
            payroll.processPromotion(1); // Insufficient experience
        } catch (InsufficientExperienceException e) {
            System.out.println("Promotion error: " + e.getMessage());
        }
    }
}