public class EmployeeID {
    private final int empId;
    
    public EmployeeID(int empId) {
        this.empId = empId;
    }
    
    public int getEmpId() {
        return empId;
    }
    
    // Attempting to create a setter method for final field
    public void setEmpId(int newId) {
        // this.empId = newId; // COMPILATION ERROR: Cannot assign to final field
        System.out.println("Cannot change final field empId!");
    }
    
    public void demonstrateConsequences() {
        System.out.println("Current ID: " + this.empId);
        
        // Attempt 1: Direct access (won't work - private)
        // this.empId = 99999; // COMPILATION ERROR: Cannot assign to final field
        
        // Attempt 2: Through setter (won't work - final field)
        this.setEmpId(99999);
        
        System.out.println("ID after 'change' attempt: " + this.empId);
        System.out.println("ID remains unchanged - final keyword protects it!");
    }
    
    public static void main(String[] args) {
        EmployeeID emp = new EmployeeID(12345);
        System.out.println("=== DEMONSTRATING FINAL FIELD PROTECTION ===");
        
        emp.demonstrateConsequences();
        
        System.out.println("\n=== WHAT HAPPENS IF WE TRY TO CHANGE ===");
        
        // Direct field access (compilation error if uncommented)
        // emp.empId = 54321; // ERROR: empId has private access
        
        // Even if field was public, final prevents change
        System.out.println("Even with public access, final prevents modification");
        
        System.out.println("\n=== CONSEQUENCES ===");
        System.out.println("1. Compilation errors prevent code from running");
        System.out.println("2. Data integrity is maintained");
        System.out.println("3. ID remains immutable: " + emp.getEmpId());
    }
}