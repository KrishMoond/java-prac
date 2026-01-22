public class Outt {
    public static void main(String args[]){
        Inn.exportedMethod();
        
        Inn innObject = new Inn();
        innObject.displayMessage();
        
        // Method 3: Call main method of Inn class
        Inn.main(new String[0]);
        
        System.out.println("Successfully imported from Inn.java");
    }
}