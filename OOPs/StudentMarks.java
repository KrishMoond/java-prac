public class StudentMarks {
    private int marks;
    
    public void setMarks(int marks) {
        if(marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks! Must be between 0-100");
        }
    }
    
    public int getMarks() {
        return marks;
    }
    
    public static void main(String[] args) {
        StudentMarks student = new StudentMarks();
        student.setMarks(85);
        System.out.println("Student marks: " + student.getMarks());
        
        student.setMarks(-10); 
        student.setMarks(110); 
    }
}