class LoginSystem {
    public static void main(String[] args) {
        String username = "admin";
        String password = "wrong123";
        String correctUsername = "admin";
        String correctPassword = "admin123";
        boolean isAccountLocked = false;
        int loginAttempts = 2;
        
         boolean loginSuccess = username.equals(correctUsername) && password.equals(correctPassword) && !isAccountLocked;
        
         loginAttempts += loginSuccess ? 0 : 1;
        
         isAccountLocked = (loginAttempts >= 3) ? true : isAccountLocked;
        
         String status = loginSuccess ? "Login Successful" : "Login Failed";
        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Status: " + status);
        System.out.println("Login Attempts: " + loginAttempts);
        System.out.println("Account Locked: " + isAccountLocked);
    }
}