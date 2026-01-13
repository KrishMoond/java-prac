class WrongCredentialsException extends Exception {
    WrongCredentialsException(String message) { super(message); }
}

class ServerDownException extends Exception {
    ServerDownException(String message) { super(message); }
}

class TokenExpiredException extends Exception {
    TokenExpiredException(String message) { super(message); }
}

class User {
    private String username;
    private String password;
    
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    String getUsername() { return username; }
    String getPassword() { return password; }
}

class MobileAppLogin {
    private User[] users = {
        new User("john", "pass123"),
        new User("jane", "secret456")
    };
    private boolean serverUp = true;
    private boolean tokenValid = true;
    
    void login(String username, String password, String token) throws WrongCredentialsException, ServerDownException, TokenExpiredException {
        if (!serverUp) {
            throw new ServerDownException("Authentication server is down");
        }
        
        if (!tokenValid) {
            throw new TokenExpiredException("Session token has expired");
        }
        
        boolean credentialsValid = false;
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                credentialsValid = true;
                break;
            }
        }
        
        if (!credentialsValid) {
            throw new WrongCredentialsException("Invalid username or password");
        }
        
        System.out.println("Login successful for user: " + username);
    }
    
    void setServerStatus(boolean status) { this.serverUp = status; }
    void setTokenStatus(boolean status) { this.tokenValid = status; }
}

public class MobileLogin {
    public static void main(String[] args) {
        MobileAppLogin app = new MobileAppLogin();
        
        try {
            app.login("john", "wrongpass", "validtoken");
        } catch (WrongCredentialsException | ServerDownException | TokenExpiredException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}