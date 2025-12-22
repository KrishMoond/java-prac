class A{
    public static void main(String[] args) {
        int x = 10;
        
         String result1 = (x > 5) ? "Greater" : "Smaller";
        System.out.println("1. " + result1);
        
         String result2 = (x % 2 == 0) ? "Even" : "Odd";
        System.out.println("2. " + result2);
        
         x += 5;
        System.out.println("3. After +=: " + x);
        
         x -= 3;
        System.out.println("4. After -=: " + x);
        
         x *= 2;
        System.out.println("5. After *=: " + x);
        
         x /= 4;
        System.out.println("6. After /=: " + x);
        
        
        int a = 20, b = 30;
        int max = (a > b) ? a : b;
        System.out.println("7. Max: " + max);
        
       
        x %= 3;
        System.out.println("8. After %=: " + x);
        
        
        String str = "Hello";
        String result3 = (str != null) ? str.toUpperCase() : "NULL";
        System.out.println("9. " + result3);
        
         int score = 85;
        String grade = (score >= 90) ? "A" : (score >= 80) ? "B" : "C";
        System.out.println("10. Grade: " + grade);
    }
}