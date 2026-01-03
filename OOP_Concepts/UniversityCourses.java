class Course {
    private String name;
    private int credits;
    
    public Course(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
    
    public String getName() {
        return name;
    }
    
    public int getCredits() {
        return credits;
    }
}

public class UniversityCourses {
    private String universityName;
    private String department;
    private Course[] courses; // Not created immediately
    
    public UniversityCourses(String universityName, String department) {
        this.universityName = universityName;
        this.department = department;
        System.out.println("University created without courses");
    }
    
    // Create courses only when showCourses() is called
    public void showCourses() {
        if(courses == null) {
            createCourses();
        }
        
        System.out.println("Courses in " + department + " Department:");
        for(int i = 0; i < courses.length; i++) {
            System.out.println((i+1) + ". " + courses[i].getName() + 
                " (" + courses[i].getCredits() + " credits)");
        }
    }
    
    private void createCourses() {
        courses = new Course[4];
        courses[0] = new Course("Data Structures", 3);
        courses[1] = new Course("Algorithms", 3);
        courses[2] = new Course("Database Systems", 4);
        courses[3] = new Course("Software Engineering", 3);
        System.out.println("Courses created when needed!");
    }
    
    public static void main(String[] args) {
        UniversityCourses university = new UniversityCourses("MIT", "Computer Science");
        
        System.out.println("University object created, but courses not loaded yet");
        
        university.showCourses(); // Courses created only when this method is called
    }
}