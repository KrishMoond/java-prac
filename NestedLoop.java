public class NestedLoop {
    public static void main(String args[]){
         System.out.println("Multiplication Table 2x2:");
        for(int i = 1; i <= 2; i++){
            for(int j = 1; j <= 2; j++){
                System.out.println(i + " x " + j + " = " + (i*j));
            }
        }
        
         System.out.println("\nStar Pattern:");
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
         System.out.println("\nNumber Pattern:");
        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        
    }
}