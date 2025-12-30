import java.util.*;
public class MaxFinder {
    public static int findMax(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void h(){
        System.out.println("Hello from MaxFinder class");
    }

    public void s(){
        System.out.println("Non-static method s called");
    }

    String title;
    MaxFinder(String title){
        this.title = title;
    }
    
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int maximum = findMax(num1, num2);
        System.out.println("Maximum: " + maximum);
        
        h(); // Call static method
        
        MaxFinder obj = new MaxFinder("Test");
        obj.s(); // Call non-static method
        
        sc.close();
    }
}