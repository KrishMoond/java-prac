public class SalaryIncrease {
    public static void main(String[] args) {
        double[] salaries = {50000, 60000, 45000, 70000, 55000};
        
        System.out.println("Original salaries:");
        for(int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i+1) + ": " + salaries[i]);
        }
        
        // Increase each salary by 10%
        for(int i = 0; i < salaries.length; i++) {
            salaries[i] = salaries[i] * 1.10;
        }
        
        System.out.println("\\nSalaries after 10% increase:");
        for(int i = 0; i < salaries.length; i++) {
            System.out.println("Employee " + (i+1) + ": " + salaries[i]);
        }
    }
}