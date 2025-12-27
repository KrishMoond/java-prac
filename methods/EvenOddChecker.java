import java.util.*;
public class EvenOddChecker {
    public static String checkEvenOdd(int number) {
        if(number % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        String result = checkEvenOdd(num);
        System.out.println(num + " is " + result);
        sc.close();
    }
}