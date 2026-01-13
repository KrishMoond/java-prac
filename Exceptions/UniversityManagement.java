class LowAttendanceException extends Exception {
    LowAttendanceException(String message) { super(message); }
}

class LowCGPAException extends Exception {
    LowCGPAException(String message) { super(message); }
}

class LateRegistrationException extends Exception {
    LateRegistrationException(String message) { super(message); }
}

class Student {
    private String name;
    private double attendance;
    private double cgpa;
    
    Student(String name, double attendance, double cgpa) {
        this.name = name;
        this.attendance = attendance;
        this.cgpa = cgpa;
    }
    
    String getName() { return name; }
    double getAttendance() { return attendance; }
    double getCgpa() { return cgpa; }
}

class UniversitySystem {
    void checkAttendance(Student student) throws LowAttendanceException {
        if (student.getAttendance() < 75.0) {
            throw new LowAttendanceException("Attendance " + student.getAttendance() + "% is below minimum 75%");
        }
        System.out.println("Attendance check passed for " + student.getName());
    }
    
    void checkCGPA(Student student) throws LowCGPAException {
        if (student.getCgpa() < 4.0) {
            throw new LowCGPAException("CGPA " + student.getCgpa() + " is below minimum 4.0");
        }
        System.out.println("CGPA check passed for " + student.getName());
    }
    
    void registerForExam(int daysAfterDeadline) throws LateRegistrationException {
        if (daysAfterDeadline > 0) {
            throw new LateRegistrationException("Registration is " + daysAfterDeadline + " days late");
        }
        System.out.println("Exam registration successful");
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        UniversitySystem system = new UniversitySystem();
        Student student = new Student("John", 70.0, 3.5);
        
        try {
            system.checkAttendance(student);
        } catch (LowAttendanceException e) {
            System.out.println("Attendance issue: " + e.getMessage());
        }
        
        try {
            system.checkCGPA(student);
        } catch (LowCGPAException e) {
            System.out.println("CGPA issue: " + e.getMessage());
        }
        
        try {
            system.registerForExam(5); // 5 days late
        } catch (LateRegistrationException e) {
            System.out.println("Registration issue: " + e.getMessage());
        }
    }
}