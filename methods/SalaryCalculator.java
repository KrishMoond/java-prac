import java.util.*;
public class SalaryCalculator {
    public static double calculateSalary(double basicSalary) {
        return basicSalary;
    }
    
    public static double calculateSalary(double basicSalary, double bonus) {
        return basicSalary + bonus;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double basic = sc.nextDouble();
        System.out.print("Include bonus? (y/n): ");
        String choice = sc.next();
        
        if(choice.equals("y")) {
            System.out.print("Enter bonus: ");
            double bonus = sc.nextDouble();
            System.out.println("Total salary: " + calculateSalary(basic, bonus));
        } else {
            System.out.println("Total salary: " + calculateSalary(basic));
        }
        sc.close();
    }
}