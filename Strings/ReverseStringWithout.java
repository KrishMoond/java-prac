public class ReverseStringWithout {
    public static void main(String[] args) {
        String str = "Hello";
        String result = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
}