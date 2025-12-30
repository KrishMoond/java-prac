public class CollegeStudent {
    private int age;
    
    public void setAge(int age) {
        if(age >= 5 && age <= 25) {
            this.age = age;
        } else {
            System.out.println("Age must be between 5-25!");
        }
    }
    
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        CollegeStudent student = new CollegeStudent();
        student.setAge(20);
        System.out.println("Student age: " + student.getAge());
        
        student.setAge(30); // Invalid
        student.setAge(3);  // Invalid
    }
}