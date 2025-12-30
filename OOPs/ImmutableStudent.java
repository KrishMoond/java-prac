public class ImmutableStudent {
    private final String name;
    private final int rollNumber;
    
    public ImmutableStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    public String getName() {
        return name;
    }
    
    public int getRollNumber() {
        return rollNumber;
    }
    
    // No setter methods - data cannot be modified after creation
    
    public static void main(String[] args) {
        ImmutableStudent student = new ImmutableStudent("Alice", 101);
        System.out.println("Name: " + student.getName());
        System.out.println("Roll Number: " + student.getRollNumber());
        
        // Cannot modify after creation - no setter methods available
    }
}