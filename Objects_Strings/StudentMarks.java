class StudentMarks {
    public static void main(String[] args) {
        int marks = 45;
        double attendance = 80.5;
        
         boolean passes = (marks >= 40) && (attendance > 75);
        
         String result = passes ? "Pass" : "Fail";
        
         marks += passes ? 5 : 0;
        
        System.out.println("Original Marks: 45");
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Result: " + result);
        System.out.println("Final Marks (with bonus): " + marks);

        
    }
}