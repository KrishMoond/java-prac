public class CheckOnlyDigits {
    public static void main(String[] args) {
        String str = "12345";
        boolean onlyDigits = true;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                onlyDigits = false;
                break;
            }
        }
        
        if (onlyDigits) {
            System.out.println(str + " contains only digits");
        } else {
            System.out.println(str + " does not contain only digits");
        }
    }
}