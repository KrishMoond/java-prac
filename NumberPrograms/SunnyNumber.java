import java.util.*;

public class SunnyNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int nextNum = num + 1;
        int sqrt = (int)Math.sqrt(nextNum);
        
        if(sqrt * sqrt == nextNum){
            System.out.println(num + " is a Sunny Number");
        } else {
            System.out.println(num + " is not a Sunny Number");
        }
         
    }
}