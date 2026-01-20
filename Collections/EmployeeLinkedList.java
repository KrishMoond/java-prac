import java.util.*;

class Employee {
    private int id;
    private String name;
    
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "'}";
    }
}

public class EmployeeLinkedList {
    public static void main(String[] args) {
        LinkedList<Employee> employees = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        
        // Add employees
        employees.add(new Employee(101, "John"));
        employees.add(new Employee(102, "Jane"));
        employees.add(new Employee(103, "Bob"));
        
        System.out.println("Current employees:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
        
        // Delete employee by ID
        System.out.print("Enter employee ID to delete: ");
        int deleteId = sc.nextInt();
        
        boolean found = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == deleteId) {
                employees.remove(i);
                found = true;
                System.out.println("Employee with ID " + deleteId + " deleted successfully");
                break;
            }
        }
        
        if (!found) {
            System.out.println("Employee with ID " + deleteId + " not found");
        }
        
        System.out.println("Updated employee list:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}