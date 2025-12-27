import java.util.*;
public class MultiplicationTable {
    public static void printTable(int number) {
        System.out.println("Multiplication table of " + number + ":");
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number for table: ");
        int num = sc.nextInt();
        
        printTable(num);
        sc.close();
    }
}