import java.util.*;
public class VotingEligibility {
    public static String checkEligibility(int age) {
        if(age >= 18) {
            return "Eligible to vote";
        } else {
            return "Not eligible to vote";
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        String result = checkEligibility(age);
        System.out.println(result);
        sc.close();
    }
}