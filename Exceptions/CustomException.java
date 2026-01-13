import java.util.*;

public class CustomException {

    static void check(int num) throws InvalidNumberException {
        if (num <= 0) {
            throw new InvalidNumberException("Number must be greater than 0. Please try again.");
        }
        System.out.println("Valid number: " + num);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int a = sc.nextInt();

            try {
                check(a);
                break;
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        String s="java";
        s.concat("World");
        System.out.println(s);
         
    }
}

class InvalidNumberException extends Exception {

    InvalidNumberException(String message) {
        super(message);
    }
}
