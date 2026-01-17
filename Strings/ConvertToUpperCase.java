public class ConvertToUpperCase {
    public static void main(String[] args) {
        String str = "hello world";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32); // Convert to uppercase
            }
            result = result + ch;
        }
        
        System.out.println("Original: " + str);
        System.out.println("Uppercase: " + result);
    }
}