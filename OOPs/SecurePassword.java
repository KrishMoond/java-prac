public class SecurePassword {
    private String password;
    
    public void setPassword(String password) {
        if(password == null || password.isEmpty()) {
            System.out.println("Password cannot be empty!");
        } else if(password.length() < 8) {
            System.out.println("Password must be at least 8 characters!");
        } else {
            this.password = password;
            System.out.println("Password set successfully");
        }
    }
    
    public boolean isPasswordSet() {
        return password != null && !password.isEmpty();
    }
    
    public static void main(String[] args) {
        SecurePassword user = new SecurePassword();
        user.setPassword("123");
        user.setPassword(""); 
        user.setPassword("mypassword123"); 
        
        System.out.println("Password set: " + user.isPasswordSet());
    }
}