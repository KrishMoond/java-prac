import java.util.*;
public class LoopPrograms {
    static Scanner sc = new Scanner(System.in);
    
    public static void multiplicationTable() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
    
    public static void evenNumbers() {
        System.out.println("Even numbers between 1 and 100:");
        for(int i = 2; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
    public static void sumOfDigits() {
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
    
    public static void sumOneToN() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum from 1 to " + n + ": " + sum);
    }
    
    public static void sumEvenOneToN() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of even numbers from 1 to " + n + ": " + sum);
    }
    
    public static void sumOddOneToN() {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i += 2) {
            sum += i;
        }
        System.out.println("Sum of odd numbers from 1 to " + n + ": " + sum);
    }
    
    public static void multiplicationTables3To5() {
        for(int table = 3; table <= 5; table++) {
            System.out.println("Table of " + table + ":");
            for(int i = 1; i <= 10; i++) {
                System.out.println(table + " x " + i + " = " + (table * i));
            }
            System.out.println();
        }
    }
    
    public static void temperatureMachine() {
        int temp = 50;
        while(temp <= 100) {
            System.out.println("Temperature: " + temp + "°C - System running");
            temp += 10;
        }
        System.out.println("Temperature: " + temp + "°C - System stopped!");
    }
    
    public static void atmPin() {
        int correctPin = 1234;
        int enteredPin;
        do {
            System.out.print("Enter PIN: ");
            enteredPin = sc.nextInt();
            if(enteredPin != correctPin) {
                System.out.println("Wrong PIN! Try again.");
            }
        } while(enteredPin != correctPin);
        System.out.println("PIN accepted!");
    }
    
    public static void positiveNumber() {
        int num;
        do {
            System.out.print("Enter a positive number: ");
            num = sc.nextInt();
            if(num <= 0) {
                System.out.println("Please enter a positive number!");
            }
        } while(num <= 0);
        System.out.println("Thank you! You entered: " + num);
    }
    
    public static void gameMenu() {
        String choice;
        do {
            System.out.println("1. Start Game");
            System.out.println("2. Settings");
            System.out.println("3. Exit");
            System.out.print("Choose option: ");
            choice = sc.next();
            
            if(choice.equals("1")) {
                System.out.println("Game started!");
            } else if(choice.equals("2")) {
                System.out.println("Settings opened!");
            }
        } while(!choice.equals("3"));
        System.out.println("Game exited!");
    }
    
    public static void studentMarks() {
        int total = 0;
        for(int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            total += sc.nextInt();
        }
        System.out.println("Total marks: " + total);
    }
    
    public static void walletBalance() {
        int balance = 1000;
        while(balance > 0) {
            System.out.println("Current balance: " + balance);
            System.out.print("Enter transaction amount: ");
            int amount = sc.nextInt();
            balance -= amount;
        }
        System.out.println("Wallet empty!");
    }
    
    public static void atmMenu() {
        String choice;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Logout");
            System.out.print("Choose option: ");
            choice = sc.next();
            
            if(choice.equals("1")) {
                System.out.println("Balance: $1000");
            } else if(choice.equals("2")) {
                System.out.println("Withdrawal successful!");
            }
        } while(!choice.equals("3"));
        System.out.println("Logged out!");
    }
    
    public static void otpVerification() {
        int correctOtp = 1234;
        int attempts = 0;
        int enteredOtp;
        
        do {
            System.out.print("Enter OTP: ");
            enteredOtp = sc.nextInt();
            attempts++;
            
            if(enteredOtp != correctOtp) {
                System.out.println("Wrong OTP! Attempts left: " + (3 - attempts));
            }
        } while(enteredOtp != correctOtp && attempts < 3);
        
        if(enteredOtp == correctOtp) {
            System.out.println("OTP verified!");
        } else {
            System.out.println("Maximum attempts reached!");
        }
    }
    
    public static void main(String args[]) {
        String choice;
        
        do {
            System.out.println("\nLOOP PROGRAMS MENU");
            System.out.println("1. Multiplication Table");
            System.out.println("2. Even Numbers 1-100");
            System.out.println("3. Sum of Digits");
            System.out.println("4. Sum 1 to N");
            System.out.println("5. Sum Even 1 to N");
            System.out.println("6. Sum Odd 1 to N");
            System.out.println("7. Tables 3 to 5");
            System.out.println("8. Temperature Machine");
            System.out.println("9. ATM PIN");
            System.out.println("10. Positive Number");
            System.out.println("11. Game Menu");
            System.out.println("12. Student Marks");
            System.out.println("13. Wallet Balance");
            System.out.println("14. ATM Menu");
            System.out.println("15. OTP Verification");
            System.out.println("16. Quit");
            System.out.print("Enter choice: ");
            choice = sc.next();
            
            if(choice.equals("1")) multiplicationTable();
            else if(choice.equals("2")) evenNumbers();
            else if(choice.equals("3")) sumOfDigits();
            else if(choice.equals("4")) sumOneToN();
            else if(choice.equals("5")) sumEvenOneToN();
            else if(choice.equals("6")) sumOddOneToN();
            else if(choice.equals("7")) multiplicationTables3To5();
            else if(choice.equals("8")) temperatureMachine();
            else if(choice.equals("9")) atmPin();
            else if(choice.equals("10")) positiveNumber();
            else if(choice.equals("11")) gameMenu();
            else if(choice.equals("12")) studentMarks();
            else if(choice.equals("13")) walletBalance();
            else if(choice.equals("14")) atmMenu();
            else if(choice.equals("15")) otpVerification();
            else if(!choice.equals("16")) System.out.println("Invalid choice!");
            
        } while(!choice.equals("16"));
        
        System.out.println("Program ended!");
    }
}