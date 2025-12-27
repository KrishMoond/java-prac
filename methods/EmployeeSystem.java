import java.util.*;
public class EmployeeSystem {
    public static double calculateSalary(double basic, double allowance) {
        return basic + allowance;
    }
    
    public static void displayEmployee(String name, int id, double salary) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Enter allowance: ");
        double allowance = sc.nextDouble();
        
        double totalSalary = calculateSalary(basic, allowance);
        displayEmployee(name, id, totalSalary);
        sc.close();
    }
}