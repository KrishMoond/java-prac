class EmployeeSalary {
    public static void main(String[] args) {
        int performanceRating = 5;
        int experience = 6;
        boolean underDisciplinaryAction = false;
        double salary = 50000.0;
        
         boolean eligible = (performanceRating > 4) && (experience > 5) && !underDisciplinaryAction;
        
         String status = eligible ? "Eligible for Increment" : "Not Eligible";
        
         salary += eligible ? (salary * 0.15) : 0;
        
        System.out.println("Performance Rating: " + performanceRating);
        System.out.println("Experience: " + experience + " years");
        System.out.println("Under Disciplinary Action: " + underDisciplinaryAction);
        System.out.println("Status: " + status);
        System.out.println("Original Salary: 50000.0");
        System.out.println("Final Salary: " + salary);
    }
}