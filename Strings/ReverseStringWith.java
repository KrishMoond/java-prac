public class ReverseStringWith {
    public static void main(String[] args) {
        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        String result = sb.reverse().toString();
        
        System.out.println("Original: " + str);
        System.out.println("Reversed: " + result);
    }
}