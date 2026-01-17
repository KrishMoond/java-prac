public class CheckEndsWithFullStop {
    public static void main(String[] args) {
        String str = "Hello World.";
        
        if (str.charAt(str.length() - 1) == '.') {
            System.out.println("String ends with full stop");
        } else {
            System.out.println("String does not end with full stop");
        }
    }
}