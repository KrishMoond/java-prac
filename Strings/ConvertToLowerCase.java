public class ConvertToLowerCase {
    public static void main(String[] args) {
        String str = "HELLO WORLD";
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); // Convert to lowercase
            }
            result = result + ch;
        }
        
        System.out.println("Original: " + str);
        System.out.println("Lowercase: " + result);
    }
}