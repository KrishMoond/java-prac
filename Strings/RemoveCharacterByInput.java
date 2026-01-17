import java.util.Scanner;

public class RemoveCharacterByInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "Hello World";
        
        System.out.println("String: " + str);
        System.out.print("Enter character to remove: ");
        char remove = sc.next().charAt(0);
        
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != remove) {
                result = result + str.charAt(i);
            }
        }
        
        System.out.println("Result: " + result);
        sc.close();
    }
}