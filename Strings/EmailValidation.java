public class EmailValidation {
    public static void main(String[] args) {
        String email = "user@example.com";
        boolean hasAt = false, hasDot = false;
        int atIndex = -1;
        
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                hasAt = true;
                atIndex = i;
            }
            if (email.charAt(i) == '.' && i > atIndex) {
                hasDot = true;
            }
        }
        
        if (hasAt && hasDot && atIndex > 0 && atIndex < email.length() - 1) {
            System.out.println(email + " is a valid email");
        } else {
            System.out.println(email + " is not a valid email");
        }
    }
}