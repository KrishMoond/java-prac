import java.util.*;

/**
 * Employee class demonstrating encapsulation with private fields
 * and public getter/setter methods.
 */
class Employee {
    private int eid;
    private String ename;
    private double sal;
    
    /**
     * Constructor to create Employee object
     * @param eid Employee ID
     * @param ename Employee name
     * @param sal Employee salary
     */
    public Employee(int eid, String ename, double sal) {
        this.eid = eid;
        this.ename = ename;
        this.sal = sal;
    }
    
    // Getter methods
    public int getEid() { 
        return eid; 
    }
    
    public String getEname() { 
        return ename;
    }
    
    public double getSal() { 
        return sal; 
    }
    
    // Setter methods
    public void setEid(int eid) {
        this.eid = eid;
    }
    
    public void setEname(String ename) {
        this.ename = ename;
    }
    
    public void setSal(double sal) {
        this.sal = sal;
    }
    
    @Override
    public String toString() {
        return "Employee{id=" + eid + ", name='" + ename + "', salary=" + sal + "}";
    }
}

/**
 * StreamDemo class demonstrating Java 8 Stream API operations
 * for filtering and processing Employee objects.
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(101, "John", 30000),
            new Employee(102, "Jane", 20000),
            new Employee(103, "Bob", 35000),
            new Employee(104, "Alice", 15000),
            new Employee(105, "Tom", 40000)
        );
        
        System.out.println("Employees with salary > 25000:");
        employees.stream()
                .filter(emp -> emp.getSal() > 25000)
                .map(Employee::getEname)
                .forEach(System.out::println);
    }
}
