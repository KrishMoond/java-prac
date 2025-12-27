public class Inn {
     public static void exportedMethod(){
        System.out.println("This method is exported from Inn.java");
    }
    
     public void displayMessage(){
        System.out.println("Instance method from Inn class");
    }
    
    public static void main(String args[]){
        System.out.println("Modules to be exported");
        exportedMethod();
    }
}

