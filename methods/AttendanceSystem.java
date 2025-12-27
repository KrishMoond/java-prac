import java.util.*;
public class AttendanceSystem {
    public static void markAttendance(String studentName) {
        System.out.println("Present: " + studentName);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        markAttendance(name);
        sc.close();
    }
}