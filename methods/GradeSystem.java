import java.util.*;
public class GradeSystem {
    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    
    public static String getGrade(int total) {
        if(total >= 270) return "A";
        else if(total >= 240) return "B";
        else if(total >= 210) return "C";
        else if(total >= 180) return "D";
        else return "F";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 3 subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        
        int total = calculateTotal(m1, m2, m3);
        String grade = getGrade(total);
        
        System.out.println("Total: " + total);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}