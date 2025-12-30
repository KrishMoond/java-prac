public class EmployeeSalary {
    private double salary;
    
    public void setSalary(double salary) {
        if(salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative!");
        }
    }
    
    public double getSalary() {
        return salary;
    }
    
    public static void main(String[] args) {
        EmployeeSalary emp = new EmployeeSalary();
        emp.setSalary(50000);
        System.out.println("Employee salary: " + emp.getSalary());
        
        emp.setSalary(-1000); // Invalid
    }
}