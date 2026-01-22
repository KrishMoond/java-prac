public class Factorial {
    public static void main(String args[]){
        int num = args.length > 0 ? Integer.parseInt(args[0]) : 5;
        
        if(num < 0) {
            System.err.println("Error: Factorial undefined for negative numbers");
            System.exit(1);
        }
        
        long factorial = 1;
        for(int i = 1; i <= num; i++){
            factorial *= i;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}