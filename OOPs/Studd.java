public class Studd {
    private final String name;
    private final int id;

    Studd (String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void attemptToChangeName() {
        System.out.println("Current name: " + this.name);
        System.out.println("Attempting to change name...");
        
        // UNCOMMENT THE LINE BELOW TO SEE COMPILATION ERROR:
        // this.name = "Krishh"; // ERROR: Cannot assign a value to final variable name
        
        System.out.println("Cannot change final field 'name'!");
        System.out.println("Name remains: " + this.name);
    }
    
    public void attemptToChangeId() {
        System.out.println("Current ID: " + this.id);
        System.out.println("Attempting to change ID...");
        
        // UNCOMMENT THE LINE BELOW TO SEE COMPILATION ERROR:
        // this.id = 999; // ERROR: Cannot assign a value to final variable id
        
        System.out.println("Cannot change final field 'id'!");
        System.out.println("ID remains: " + this.id);
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Studd student = new Studd("Krish", 10);
        System.out.println("=== INITIAL VALUES ===");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());

        System.out.println("\n=== ATTEMPTING TO CHANGE NAME ===");
        student.attemptToChangeName();
        
        System.out.println("\n=== ATTEMPTING TO CHANGE ID ===");
        student.attemptToChangeId();
        
        System.out.println("\n=== FINAL VALUES (UNCHANGED) ===");
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        
        System.out.println("\n=== TO SEE ACTUAL COMPILATION ERRORS ===");
        System.out.println("Uncomment the assignment lines in the methods above");
        System.out.println("Then try: javac Studd.java");
        System.out.println("You will get: 'Cannot assign a value to final variable'");
    }
}
