import java.util.*;
public class MarksCalculator {
    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for 3 subjects: ");
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        
        int total = calculateTotal(marks1, marks2, marks3);
        System.out.println("Total marks: " + total);
        sc.close();
    }
}