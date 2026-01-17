public class FirstLastCharacter {
    public static void main(String[] args) {
        String str = "Hello";
        
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        
        System.out.println("String: " + str);
        System.out.println("First character: " + first);
        System.out.println("Last character: " + last);
    }
}