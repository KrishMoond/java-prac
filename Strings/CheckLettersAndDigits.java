public class CheckLettersAndDigits {
    public static void main(String[] args) {
        String str = "Hello123";
        boolean hasLetter = false, hasDigit = false;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                hasLetter = true;
            }
            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
            }
        }
        
        if (hasLetter && hasDigit) {
            System.out.println(str + " contains both letters and digits");
        } else {
            System.out.println(str + " does not contain both letters and digits");
        }
    }
}