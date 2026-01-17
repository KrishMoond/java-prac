public class CheckOnlyLetters {
    public static void main(String[] args) {
        String str = "Hello";
        boolean onlyLetters = true;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                onlyLetters = false;
                break;
            }
        }
        
        if (onlyLetters) {
            System.out.println(str + " contains only letters");
        } else {
            System.out.println(str + " does not contain only letters");
        }
    }
}