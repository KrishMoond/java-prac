public class EmployeeID {
    private final int empId;
    
    public EmployeeID(int empId) {
        this.empId = empId;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    // No setter method - ID cannot be changed after creation
    
    public static void main(String[] args) {
        EmployeeID emp = new EmployeeID(12345);
        System.out.println("Employee ID: " + emp.getEmpId());
        
        // emp.empId = 54321; // This would cause error - cannot access private field
        // No way to change ID after creation
    }
}