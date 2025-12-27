public class HighestSalary {
    public static void main(String[] args) {
        double[] salaries = {45000, 67000, 23000, 89000, 34000};
        double highest = salaries[0];
        
        for(int i = 1; i < salaries.length; i++) {
            if(salaries[i] > highest) {
                highest = salaries[i];
            }
        }
        
        System.out.println("Highest Salary: " + highest);
    }
}