public class StudentProfile {
    private String name;
    private int age;
    private String className;
    
    public StudentProfile setName(String name) {
        this.name = name;
        return this;
    }
    
    public StudentProfile setAge(int age) {
        this.age = age;
        return this;
    }
    
    public StudentProfile setClassName(String className) {
        this.className = className;
        return this;
    }
    
    public void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Class: " + className);
    }
    
    public static void main(String[] args) {
        new StudentProfile()
            .setName("Alice")
            .setAge(15)
            .setClassName("10th Grade")
            .display();
            
        System.out.println();
        
        new StudentProfile()
            .setName("Bob")
            .setAge(16)
            .setClassName("11th Grade")
            .display();
    }
}