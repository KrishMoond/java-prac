import java.util.*;
public class WelcomeMessage {
    public static void displayWelcome(String username) {
        System.out.println("Welcome " + username + " to our company portal!");
        System.out.println("Have a great day at work!");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = sc.nextLine();
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        
        if(username.equals("admin") && password.equals("123")) {
            displayWelcome(username);
        } else {
            System.out.println("Invalid login credentials!");
        }
        sc.close();
    }
}