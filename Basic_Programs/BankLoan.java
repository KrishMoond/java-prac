class BankLoan {
    public static void main(String[] args) {
        int age = 35;
        double monthlySalary = 30000.0;
        int creditScore = 750;
        
        boolean eligible = (age >= 21 && age <= 60) && (monthlySalary >= 25000) && (creditScore >= 700);
        
        System.out.println("Age: " + age);
        System.out.println("Monthly Salary: " + monthlySalary);
        System.out.println("Credit Score: " + creditScore);
        System.out.println("Loan Eligibility: " + (eligible ? "Eligible" : "Not Eligible"));
    }
}